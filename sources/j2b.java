// default package

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.service.media.MediaBrowserService;
import android.util.SparseArray;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Cells.f;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class j2b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j2b(fab fabVar, z3b z3bVar, ArrayList arrayList) {
        this.a = (byte) 11;
        this.b = fabVar;
        this.d = z3bVar;
        this.c = arrayList;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(3:475|476|(11:478|352|353|354|(6:356|357|(2:424|(2:436|(2:440|441))(3:430|431|432))(3:373|374|375)|(4:377|(1:379)(1:415)|380|(5:382|(1:384)(1:412)|385|386|(4:(2:389|(1:394))(1:411)|(1:406)(1:400)|401|(3:403|404|405)))(2:413|414))|417|418)|456|457|450|(0)|417|418))|353|354|(0)|456|457|450|(0)|417|418) */
    /* JADX WARN: Can't wrap try/catch for region: R(15:345|(3:346|347|348)|349|(3:475|476|(11:478|352|353|354|(6:356|357|(2:424|(2:436|(2:440|441))(3:430|431|432))(3:373|374|375)|(4:377|(1:379)(1:415)|380|(5:382|(1:384)(1:412)|385|386|(4:(2:389|(1:394))(1:411)|(1:406)(1:400)|401|(3:403|404|405)))(2:413|414))|417|418)|456|457|450|(0)|417|418))|351|352|353|354|(0)|456|457|450|(0)|417|418) */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0861, code lost:
    
        if (r16.booleanValue() == r0) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x0839, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x083a, code lost:
    
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x083f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x0840, code lost:
    
        r6 = r19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:356:0x07c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0850  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0847 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:467:0x08d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:474:? A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        byte b;
        byte b2;
        Throwable th;
        InputStream inputStream;
        boolean z;
        InputStream inputStream2;
        File file;
        int i;
        byte[] bArr;
        boolean z2;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Photo photo;
        k47 k47Var;
        int e1;
        boolean contains;
        TLRPC.Message message;
        int i2;
        int i3;
        char c = 7;
        byte b3 = 80;
        byte b4 = 27;
        byte b5 = 2;
        InputStream inputStream3 = null;
        r10 = null;
        r10 = null;
        nv1 nv1Var = null;
        byte b6 = 1;
        int i4 = 0;
        r12 = false;
        boolean z3 = false;
        switch (this.a) {
            case 0:
                x2b x2bVar = (x2b) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList arrayList3 = new ArrayList();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                int size = arrayList.size();
                Boolean bool = null;
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList.get(i5);
                    char c2 = c;
                    if (obj instanceof Uri) {
                        Uri uri = (Uri) obj;
                        String[] strArr = MediaController.W1;
                        b = b5;
                        String str = "webp";
                        try {
                            inputStream = a.b.getContentResolver().openInputStream(uri);
                        } catch (Exception unused) {
                            inputStream = inputStream3;
                        } catch (Throwable th2) {
                            th = th2;
                            if (inputStream3 == null) {
                            }
                        }
                        try {
                            if (inputStream == null) {
                                try {
                                    file = new File(uri.getPath());
                                } catch (Exception e) {
                                    e = e;
                                    z = b6;
                                    inputStream2 = inputStream;
                                    fc4.g(e, z);
                                    if (inputStream2 != null) {
                                    }
                                    str = null;
                                    if (str != null) {
                                    }
                                    b2 = 1;
                                    i5++;
                                    b6 = b2;
                                    c = c2;
                                    b5 = b;
                                    b3 = 80;
                                    inputStream3 = null;
                                    i4 = 0;
                                } catch (Throwable th3) {
                                    th = th3;
                                    inputStream3 = inputStream;
                                    if (inputStream3 == null) {
                                    }
                                }
                                if (file.exists()) {
                                    inputStream2 = new FileInputStream(file);
                                    byte b7 = b6;
                                    bArr = new byte[12];
                                    if (inputStream2.read(bArr, i4, 12) == 12) {
                                        try {
                                            byte b8 = bArr[i4];
                                            if (b8 == -119 && bArr[b7] == b3 && bArr[b] == 78 && bArr[3] == 71 && bArr[4] == 13 && bArr[5] == 10 && bArr[6] == 26 && bArr[c2] == 10) {
                                                str = "png";
                                                try {
                                                    inputStream2.close();
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    z2 = b7;
                                                    fc4.g(e, z2);
                                                    if (str != null) {
                                                    }
                                                    b2 = 1;
                                                    i5++;
                                                    b6 = b2;
                                                    c = c2;
                                                    b5 = b;
                                                    b3 = 80;
                                                    inputStream3 = null;
                                                    i4 = 0;
                                                }
                                            } else if (b8 == 31 && bArr[1] == -117) {
                                                try {
                                                    inputStream2.close();
                                                } catch (Exception e3) {
                                                    fc4.g(e3, true);
                                                }
                                                str = "tgs";
                                            } else {
                                                String lowerCase = new String(bArr).toLowerCase();
                                                if (lowerCase.startsWith("riff") && lowerCase.endsWith("webp")) {
                                                    try {
                                                        inputStream2.close();
                                                    } catch (Exception e4) {
                                                        e = e4;
                                                        z2 = 1;
                                                        fc4.g(e, z2);
                                                        if (str != null) {
                                                        }
                                                        b2 = 1;
                                                        i5++;
                                                        b6 = b2;
                                                        c = c2;
                                                        b5 = b;
                                                        b3 = 80;
                                                        inputStream3 = null;
                                                        i4 = 0;
                                                    }
                                                }
                                            }
                                        } catch (Exception e5) {
                                            e = e5;
                                            z = 1;
                                            fc4.g(e, z);
                                            if (inputStream2 != null) {
                                                try {
                                                    inputStream2.close();
                                                } catch (Exception e6) {
                                                    Exception e7 = e6;
                                                    fc4.g(e7, z);
                                                    str = null;
                                                    if (str != null) {
                                                    }
                                                    b2 = 1;
                                                    i5++;
                                                    b6 = b2;
                                                    c = c2;
                                                    b5 = b;
                                                    b3 = 80;
                                                    inputStream3 = null;
                                                    i4 = 0;
                                                }
                                            }
                                            str = null;
                                            if (str != null) {
                                            }
                                            b2 = 1;
                                            i5++;
                                            b6 = b2;
                                            c = c2;
                                            b5 = b;
                                            b3 = 80;
                                            inputStream3 = null;
                                            i4 = 0;
                                        }
                                        if (str != null) {
                                            boolean equals = "tgs".equals(str);
                                            if (bool != null) {
                                                break;
                                            } else {
                                                bool = Boolean.valueOf(equals);
                                            }
                                            if (x2bVar.J) {
                                                return;
                                            }
                                            t5a t5aVar = new t5a();
                                            t5aVar.e = equals;
                                            String o = MediaController.o((equals ? 64 : 512) << 10, uri, str);
                                            t5aVar.a = o;
                                            if (o != null) {
                                                if (equals) {
                                                    t5aVar.d = "application/x-tgsticker";
                                                } else {
                                                    BitmapFactory.decodeFile(o, options);
                                                    int i6 = options.outWidth;
                                                    if ((i6 == 512 && (i = options.outHeight) > 0 && i <= 512) || (options.outHeight == 512 && i6 > 0 && i6 <= 512)) {
                                                        t5aVar.d = "image/".concat(str);
                                                        t5aVar.c = true;
                                                    }
                                                }
                                                if (arrayList2 != null && arrayList2.size() == size && (arrayList2.get(i5) instanceof String)) {
                                                    t5aVar.b = (String) arrayList2.get(i5);
                                                } else {
                                                    t5aVar.b = "#️⃣";
                                                }
                                                arrayList3.add(t5aVar);
                                                if (arrayList3.size() >= 200) {
                                                    gm.c3(new hw9((Object) x2bVar, (Object) arrayList3, (Object) bool, (byte) 27));
                                                    return;
                                                }
                                            }
                                        }
                                        b2 = 1;
                                    }
                                    inputStream2.close();
                                    str = null;
                                    if (str != null) {
                                    }
                                    b2 = 1;
                                }
                            }
                            bArr = new byte[12];
                            if (inputStream2.read(bArr, i4, 12) == 12) {
                            }
                            inputStream2.close();
                            str = null;
                            if (str != null) {
                            }
                            b2 = 1;
                        } catch (Throwable th4) {
                            th = th4;
                            inputStream3 = inputStream2;
                            if (inputStream3 == null) {
                                throw th;
                            }
                            try {
                                inputStream3.close();
                                throw th;
                            } catch (Exception e8) {
                                fc4.g(e8, true);
                                throw th;
                            }
                        }
                        inputStream2 = inputStream;
                        byte b72 = b6;
                    } else {
                        b = b5;
                        b2 = b6;
                    }
                    i5++;
                    b6 = b2;
                    c = c2;
                    b5 = b;
                    b3 = 80;
                    inputStream3 = null;
                    i4 = 0;
                }
                gm.c3(new hw9((Object) x2bVar, (Object) arrayList3, (Object) bool, (byte) 27));
                return;
            case 1:
                d3b d3bVar = (d3b) this.b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.c;
                TLRPC.TL_messages_foundStickerSets tL_messages_foundStickerSets = (TLRPC.TL_messages_foundStickerSets) this.d;
                String str2 = tL_messages_searchStickerSets.q;
                e3b e3bVar = d3bVar.a;
                String str3 = e3bVar.S;
                r3c r3cVar = e3bVar.e;
                if (str2.equals(str3)) {
                    d3bVar.a();
                    r3cVar.b.h.getProgressDrawable().e = false;
                    e3bVar.O = 0;
                    r3cVar.b(true);
                    e3bVar.F.addAll(tL_messages_foundStickerSets.sets);
                    e3bVar.f();
                    return;
                }
                return;
            case 2:
                h4b h4bVar = (h4b) this.b;
                TLObject tLObject = (TLObject) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                int i7 = h4bVar.a;
                h4bVar.R = true;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    h4bVar.S = null;
                    nm7.f(i7).k(nm7.d3, new Object[0]);
                    return;
                } else if (!(tLObject instanceof TL_stories.canSendStoryCount)) {
                    h4bVar.m(tL_error);
                    return;
                } else {
                    h4bVar.S = new xy(1, ((TL_stories.canSendStoryCount) tLObject).count_remains, -1L);
                    nm7.f(i7).k(nm7.d3, new Object[0]);
                    return;
                }
            case 3:
                t3b t3bVar = (t3b) this.b;
                s3b s3bVar = (s3b) this.c;
                iu iuVar = (iu) this.d;
                ArrayList arrayList4 = t3bVar.i;
                for (int i8 = 0; i8 < arrayList4.size(); i8++) {
                    k47 k47Var2 = (k47) arrayList4.get(i8);
                    if (k47Var2 != null && (storyItem = k47Var2.l) != null && (messageMedia = storyItem.media) != null) {
                        TLRPC.MessageMedia messageMedia2 = s3bVar.media;
                        TLRPC.Document document = messageMedia2.document;
                        if (document != null) {
                            TLRPC.Document document2 = messageMedia.document;
                            if (document2 == null) {
                                continue;
                            } else if (document2.id == document.id) {
                                iuVar.a((s3b) storyItem);
                                return;
                            }
                        }
                        TLRPC.Photo photo2 = messageMedia2.photo;
                        if (photo2 != null && (photo = messageMedia.photo) != null && photo.id == photo2.id) {
                            iuVar.a((s3b) storyItem);
                            return;
                        }
                    }
                }
                iuVar.a(null);
                return;
            case 4:
                t3b t3bVar2 = (t3b) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                Runnable runnable = (Runnable) this.d;
                w3b w3bVar = t3bVar2.q;
                ArrayList arrayList5 = t3bVar2.G;
                ArrayList arrayList6 = t3bVar2.i;
                ArrayList arrayList7 = t3bVar2.H;
                t3bVar2.F = 0;
                t3bVar2.C = false;
                t3bVar2.D = true;
                t3bVar2.r = true;
                ArrayList arrayList8 = new ArrayList();
                if (tLObject2 instanceof Vector) {
                    ArrayList<T> arrayList9 = ((Vector) tLObject2).objects;
                    int size2 = arrayList9.size();
                    int i9 = 0;
                    while (i9 < size2) {
                        Object obj2 = arrayList9.get(i9);
                        i9++;
                        arrayList8.add((TL_bots.botPreviewMedia) obj2);
                    }
                } else {
                    if (!(tLObject2 instanceof TL_bots.previewInfo)) {
                        return;
                    }
                    TL_bots.previewInfo previewinfo = (TL_bots.previewInfo) tLObject2;
                    arrayList5.clear();
                    arrayList5.addAll(previewinfo.lang_codes);
                    arrayList8.addAll(previewinfo.media);
                }
                ArrayList arrayList10 = new ArrayList(arrayList6);
                arrayList6.clear();
                arrayList7.clear();
                int size3 = arrayList8.size();
                int i10 = 0;
                while (i10 < size3) {
                    Object obj3 = arrayList8.get(i10);
                    i10++;
                    TL_bots.botPreviewMedia botpreviewmedia = (TL_bots.botPreviewMedia) obj3;
                    w3b w3bVar2 = w3bVar;
                    int i11 = size3;
                    k47 k47Var3 = new k47(t3bVar2.c, new s3b(t3bVar2, t3bVar2.d, botpreviewmedia));
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList10.size()) {
                            k47Var = null;
                        } else if (oc7.q0(((k47) arrayList10.get(i12)).l.media, botpreviewmedia.media)) {
                            k47Var = (k47) arrayList10.get(i12);
                        } else {
                            i12++;
                        }
                    }
                    TL_stories.StoryItem storyItem2 = k47Var3.l;
                    TLRPC.Message message2 = k47Var3.k;
                    if (k47Var == null) {
                        e1 = t3bVar2.I;
                        t3bVar2.I = e1 + 1;
                    } else {
                        e1 = k47Var.e1();
                    }
                    message2.id = e1;
                    storyItem2.id = e1;
                    k47Var3.j = t3bVar2;
                    k47Var3.r0(false);
                    if (arrayList7.isEmpty()) {
                        arrayList7.add(new ArrayList());
                    }
                    ((ArrayList) arrayList7.get(0)).add(Integer.valueOf(k47Var3.e1()));
                    arrayList6.add(k47Var3);
                    size3 = i11;
                    w3bVar = w3bVar2;
                }
                w3b w3bVar3 = w3bVar;
                gm.r(w3bVar3);
                gm.c3(w3bVar3);
                if (runnable != null) {
                    gm.c3(runnable);
                    return;
                }
                return;
            case 5:
                v5b v5bVar = (v5b) this.b;
                gn3 gn3Var = (gn3) this.c;
                long[] jArr = (long[]) this.d;
                if (v5bVar.t == null || v5bVar.x == null) {
                    return;
                }
                gn3[] gn3VarArr = DictationAsr.a;
                if (gn3Var != null && gn3Var.j) {
                    DictationAsr.J(jArr);
                    v5bVar.t.f(jArr[0], jArr[1], true);
                    return;
                } else {
                    if (DictationAsr.y(gn3Var)) {
                        v5bVar.j();
                        return;
                    }
                    return;
                }
            case 6:
                String[] strArr2 = (String[]) this.b;
                int[][] iArr = (int[][]) this.c;
                hza hzaVar = (hza) this.d;
                for (int i13 = 0; i13 < strArr2.length; i13++) {
                    String str4 = strArr2[i13];
                    if (str4 != null) {
                        AnimatedFileNative.d(str4, iArr[i13], 0L);
                    }
                }
                gm.c3(hzaVar);
                return;
            case 7:
                String str5 = (String) this.b;
                int[][] iArr2 = (int[][]) this.c;
                hza hzaVar2 = (hza) this.d;
                AnimatedFileNative.d(str5, iArr2[0], 0L);
                gm.c3(hzaVar2);
                return;
            case 8:
                v7b v7bVar = (v7b) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                oc7 oc7Var = (oc7) this.d;
                a8b a8bVar = v7bVar.a0;
                v7bVar.w.setLoading(false);
                if (tLObject3 != null) {
                    int i14 = a8b.X1;
                    ArrayList I0 = a8bVar.I0();
                    for (int i15 = 0; i15 < I0.size(); i15++) {
                        TLRPC.User user = (TLRPC.User) I0.get(i15);
                        if (user != null && (contains = v7bVar.c.contains(Long.valueOf(user.id))) != user.close_friend) {
                            user.close_friend = contains;
                            int i16 = user.flags2;
                            user.flags2 = contains ? i16 | 4 : i16 & (-5);
                            oc7Var.c4(user, false, false);
                        }
                    }
                }
                a8bVar.F0();
                if (a8bVar.T1) {
                    a8bVar.G0(new y7b(1, a8bVar.a, (ArrayList) null), new s48(a8bVar, b6), false);
                    return;
                } else {
                    a8bVar.F0();
                    a8bVar.l1.E(0);
                    return;
                }
            case 9:
                v9b v9bVar = (v9b) this.b;
                ((g6b) this.c).O0 = (File) this.d;
                r8b r8bVar = v9bVar.e1;
                if (r8bVar != null) {
                    r8bVar.b.g3.O(false);
                    return;
                }
                return;
            case 10:
                v9b v9bVar2 = (v9b) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                Runnable runnable2 = (Runnable) this.d;
                if (bitmap != null) {
                    try {
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), v9bVar2.C0.getMatrix(), true);
                        bitmap.recycle();
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 80, (int) (createBitmap.getHeight() / (createBitmap.getWidth() / 80.0f)), true);
                        if (createScaledBitmap != null) {
                            if (createScaledBitmap != createBitmap) {
                                createBitmap.recycle();
                            }
                            Utilities.blurBitmap(createScaledBitmap, 7);
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(a.h(), "cthumb.jpg"));
                            createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                            createScaledBitmap.recycle();
                            fileOutputStream.close();
                        }
                    } catch (Throwable unused2) {
                    }
                }
                gm.c3(runnable2);
                return;
            case 11:
                fab fabVar = (fab) this.b;
                z3b z3bVar = (z3b) this.d;
                ArrayList arrayList11 = (ArrayList) this.c;
                oab oabVar = fabVar.d;
                oabVar.o0.D(oabVar.h, z3bVar.d, arrayList11);
                return;
            case 12:
                ((MediaBrowserService.Result) ((cj6) this.c).b).sendResult(((iib) this.b).d((String) this.d));
                return;
            case 13:
                ((hib) this.b).q((String) this.c, (Bundle) this.d);
                return;
            case 14:
                bmb bmbVar = (bmb) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                bmb bmbVar2 = (bmb) this.d;
                if (!(tLObject4 instanceof TLRPC.TL_wallPaper)) {
                    bmbVar.r();
                    return;
                }
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject4;
                bmbVar.h0 = bc4.r(null, tL_wallPaper.document);
                nm7.f(bmbVar.F).a(bmbVar, nm7.Y1);
                nm7.f(bmbVar.F).a(bmbVar, nm7.Z1);
                bc4.G(bmbVar2.F).X(tL_wallPaper.document, tL_wallPaper, 1, 1);
                return;
            case 15:
                ((zob) this.b).c0((TLRPC.TL_error) this.c, (TL_account.updateTheme) this.d);
                return;
            case 16:
                zob zobVar = (zob) this.b;
                String str6 = (String) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                zobVar.y = 0;
                String str7 = zobVar.E;
                if (str7 == null || !str7.equals(str6)) {
                    return;
                }
                if (tL_error2 == null || !("THEME_SLUG_INVALID".equals(tL_error2.text) || "THEME_SLUG_OCCUPIED".equals(tL_error2.text))) {
                    zobVar.f0(cmb.v6, jb6.a0("SetUrlAvailable", null, 2131745242, str6));
                    return;
                } else {
                    zobVar.f0(cmb.o7, jb6.M0(2131745240, null));
                    return;
                }
            case 17:
                f fVar = (f) this.b;
                bmb bmbVar3 = (bmb) this.c;
                bmbVar3.f = !bmbVar3.b((File) this.d, bmbVar3.c);
                gm.c3(new b7b((Object) fVar, (Object) bmbVar3, (byte) 14));
                return;
            case 18:
                xqb xqbVar = (xqb) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                SharedPreferences sharedPreferences = (SharedPreferences) this.d;
                ArrayList arrayList12 = xqbVar.d;
                if (tLObject5 instanceof TLRPC.TL_help_timezonesList) {
                    arrayList12.clear();
                    arrayList12.addAll(((TLRPC.TL_help_timezonesList) tLObject5).timezones);
                    SerializedData serializedData = new SerializedData(tLObject5.getObjectSize());
                    tLObject5.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.f(serializedData.toByteArray())).apply();
                    nm7.f(xqbVar.a).k(nm7.t3, new Object[0]);
                }
                xqbVar.c = true;
                xqbVar.b = false;
                return;
            case 19:
                krb krbVar = (krb) this.b;
                yv1 yv1Var = (yv1) this.c;
                TLRPC.TodoItem todoItem = (TLRPC.TodoItem) this.d;
                k47 k47Var4 = krbVar.H;
                int i17 = todoItem.id;
                if (k47Var4 != null && (message = k47Var4.k) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    k47.B0(message);
                    nv1Var = new nv1();
                    nv1Var.a = k47Var4;
                    nv1Var.b = -1;
                    nv1Var.c = -1;
                    nv1Var.g = true;
                    nv1Var.d = i17;
                    nv1Var.f();
                }
                yv1Var.ec(k47Var4, nv1Var);
                krbVar.b(false);
                return;
            case 20:
                avb avbVar = (avb) this.b;
                ArrayList arrayList13 = (ArrayList) this.c;
                TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) this.d;
                ArrayList arrayList14 = avbVar.h;
                arrayList14.clear();
                ArrayList arrayList15 = avbVar.f;
                arrayList15.clear();
                arrayList14.addAll(arrayList13);
                arrayList15.addAll(tL_messages_inactiveChats.chats);
                avbVar.d.f();
                if (avbVar.a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    avbVar.E = ofFloat;
                    ofFloat.addUpdateListener(new rha(avbVar, b4));
                    avbVar.E.setDuration(100L);
                    avbVar.E.start();
                } else {
                    avbVar.F = 1.0f;
                }
                gm.r(avbVar.J);
                if (avbVar.G.getVisibility() == 0) {
                    avbVar.G.animate().alpha(0.0f).setListener(new wub(avbVar, b5)).start();
                    return;
                }
                return;
            case 21:
                sxb sxbVar = (sxb) this.b;
                ArrayList arrayList16 = (ArrayList) this.c;
                Runnable runnable3 = (Runnable) this.d;
                sxbVar.s.d(arrayList16, sxbVar.a);
                runnable3.run();
                return;
            case 22:
                nxb nxbVar = (nxb) this.b;
                String str8 = (String) this.c;
                TLObject tLObject6 = (TLObject) this.d;
                ArrayList arrayList17 = nxbVar.g0;
                if (str8.equals(nxbVar.e0)) {
                    int i18 = nxbVar.n0;
                    nxbVar.s0 = false;
                    nxbVar.o0 = false;
                    if (tLObject6 instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject6;
                        for (int i19 = 0; i19 < messages_messages.messages.size(); i19++) {
                            TLRPC.Message message3 = messages_messages.messages.get(i19);
                            i2 = ((d) nxbVar.w0).currentAccount;
                            k47 k47Var5 = new k47(i2, message3, false, false);
                            k47Var5.J5(str8, true);
                            arrayList17.add(k47Var5);
                        }
                        nxbVar.N();
                        if (arrayList17.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z3 = true;
                        }
                        nxbVar.p0 = z3;
                    } else {
                        nxbVar.p0 = false;
                    }
                    if (nxbVar.n0 == 0) {
                        nxbVar.q0.e(nxbVar.o0, true);
                    }
                    nxbVar.r0.b(i18);
                    return;
                }
                return;
            case 23:
                b3c b3cVar = (b3c) this.b;
                TL_stories.StoryItem storyItem3 = (TL_stories.StoryItem) this.c;
                z2c z2cVar = (z2c) this.d;
                storyItem3.detectedLng = "und";
                b3cVar.getMessagesController().N1().k.h(storyItem3.dialogId, storyItem3);
                b3cVar.J.remove(z2cVar);
                return;
            case 24:
                c4c c4cVar = (c4c) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                SparseArray sparseArray = c4cVar.f;
                ArrayList arrayList18 = c4cVar.e;
                ArrayList arrayList19 = c4cVar.n;
                SparseArray sparseArray2 = c4cVar.d;
                c4cVar.r = false;
                if (tL_error3 != null || !(tLObject7 instanceof TLRPC.TL_messages_featuredStickers)) {
                    c4cVar.s = true;
                    return;
                }
                ArrayList<TLRPC.StickerSetCovered> arrayList20 = ((TLRPC.TL_messages_featuredStickers) tLObject7).sets;
                if (arrayList20.size() < 40) {
                    c4cVar.s = true;
                }
                if (arrayList20.isEmpty()) {
                    return;
                }
                if (arrayList19.isEmpty()) {
                    int i20 = c4cVar.x;
                    c4cVar.x = i20 + 1;
                    sparseArray2.put(i20, -1);
                }
                arrayList19.addAll(arrayList20);
                int size4 = arrayList18.size();
                for (int i21 = 0; i21 < arrayList20.size(); i21++) {
                    TLRPC.StickerSetCovered stickerSetCovered = arrayList20.get(i21);
                    if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                        arrayList18.add(stickerSetCovered);
                        sparseArray.put(c4cVar.x, stickerSetCovered);
                        int i22 = c4cVar.x;
                        c4cVar.x = i22 + 1;
                        int i23 = size4 + 1;
                        sparseArray2.put(i22, Integer.valueOf(size4));
                        if (stickerSetCovered.covers.isEmpty()) {
                            sparseArray2.put(c4cVar.x, stickerSetCovered.cover);
                            i3 = 1;
                        } else {
                            i3 = (int) Math.ceil(stickerSetCovered.covers.size() / c4cVar.w);
                            for (int i24 = 0; i24 < stickerSetCovered.covers.size(); i24++) {
                                sparseArray2.put(c4cVar.x + i24, stickerSetCovered.covers.get(i24));
                            }
                        }
                        int i25 = 0;
                        while (true) {
                            int i26 = c4cVar.w * i3;
                            int i27 = c4cVar.x;
                            if (i25 < i26) {
                                sparseArray.put(i27 + i25, stickerSetCovered);
                                i25++;
                            } else {
                                c4cVar.x = i26 + i27;
                                size4 = i23;
                            }
                        }
                    }
                }
                c4cVar.f();
                return;
            case 25:
                cac cacVar = (cac) this.b;
                ArrayList arrayList21 = (ArrayList) this.c;
                ArrayList arrayList22 = (ArrayList) this.d;
                bu9 bu9Var = cacVar.f;
                if (cacVar.n) {
                    cacVar.h = null;
                    cacVar.d = arrayList21;
                    cacVar.e = arrayList22;
                    bu9Var.f(arrayList21, null);
                    if (cacVar.n && !bu9Var.e()) {
                        cacVar.w.f.e(false, true);
                    }
                    cacVar.f();
                    return;
                }
                return;
            case 26:
                t76 t76Var = (t76) this.b;
                q9a q9aVar = (q9a) this.c;
                try {
                    try {
                        q9aVar.n(((ny) this.d).apply(kke.a(t76Var)));
                        return;
                    } catch (Throwable th5) {
                        q9aVar.m(th5);
                        return;
                    }
                } catch (Error e9) {
                    e = e9;
                    q9aVar.m(e);
                    return;
                } catch (CancellationException unused3) {
                    q9aVar.cancel(false);
                    return;
                } catch (RuntimeException e10) {
                    e = e10;
                    q9aVar.m(e);
                    return;
                } catch (ExecutionException e11) {
                    e = e11;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    q9aVar.m(e);
                    return;
                }
            case 27:
                q9a q9aVar2 = (q9a) this.b;
                lj6 lj6Var = (lj6) this.c;
                q8a q8aVar = (q8a) this.d;
                try {
                    if (q9aVar2.a instanceof h2) {
                        return;
                    }
                    lj6Var.run();
                    q9aVar2.l(q8aVar);
                    return;
                } catch (Throwable th6) {
                    q9aVar2.m(th6);
                    return;
                }
            case 28:
                int[] iArr3 = (int[]) this.b;
                qac[] qacVarArr = (qac[]) this.c;
                Runnable runnable4 = (Runnable) this.d;
                Pattern pattern = Utilities.a;
                int i28 = iArr3[0] + 1;
                iArr3[0] = i28;
                if (i28 == qacVarArr.length) {
                    runnable4.run();
                    return;
                }
                return;
            default:
                ((VideoAds) this.b).lambda$show$3((u31) this.c, (TLRPC.TL_sponsoredMessage) this.d);
                return;
        }
    }

    public /* synthetic */ j2b(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
