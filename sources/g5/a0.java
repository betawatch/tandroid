package g5;

import android.net.Uri;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.telegram.ui.ai;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class a0 extends g {
    public RandomAccessFile a;
    public Uri b;
    public long c;
    public boolean d;

    @Override // g5.m
    public final void close() {
        this.b = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.a;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new z(e, 2000);
            }
        } finally {
            this.a = null;
            if (this.d) {
                this.d = false;
                transferEnded();
            }
        }
    }

    @Override // g5.m
    public final Uri getUri() {
        return this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
    
        if (r1 != false) goto L39;
     */
    @Override // g5.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long open(p pVar) {
        boolean b10;
        Uri uri = pVar.a;
        long j10 = pVar.e;
        this.b = uri;
        transferInitializing(pVar);
        int i10 = 2006;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.a = randomAccessFile;
            try {
                randomAccessFile.seek(j10);
                long j11 = pVar.f;
                if (j11 == -1) {
                    j11 = this.a.length() - j10;
                }
                this.c = j11;
                if (j11 < 0) {
                    throw new z(null, null, 2008);
                }
                this.d = true;
                transferStarted(pVar);
                return this.c;
            } catch (IOException e) {
                throw new z(e, 2000);
            }
        } catch (FileNotFoundException e6) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                if (h5.d0.a >= 21) {
                    b10 = y.b(e6.getCause());
                }
                i10 = 2005;
                throw new z(e6, i10);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder l10 = ai.l("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            l10.append(fragment);
            throw new z(l10.toString(), e6, 1004);
        } catch (SecurityException e10) {
            throw new z(e10, 2006);
        } catch (RuntimeException e11) {
            throw new z(e11, 2000);
        }
    }

    @Override // g5.j
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.c;
        if (j10 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.a;
            int i12 = h5.d0.a;
            int read = randomAccessFile.read(bArr, i10, (int) Math.min(j10, i11));
            if (read > 0) {
                this.c -= read;
                bytesTransferred(read);
            }
            return read;
        } catch (IOException e) {
            throw new z(e, 2000);
        }
    }
}
