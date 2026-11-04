package org.telegram.messenger;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.media.MediaDescription;
import android.media.browse.MediaBrowser;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.PlaybackStateCompat;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class oz {
    public static volatile oz p;
    public final Context a;
    public final android.support.v4.media.session.a0 b;
    public int c;
    public long d;
    public boolean e;
    public boolean f;
    public Paint m;
    public RectF n;
    public final ArrayList g = new ArrayList();
    public final a0.h h = new a0.h();
    public final a0.h i = new a0.h();
    public final a0.h j = new a0.h();
    public final a0.h k = new a0.h();
    public final a0.h l = new a0.h();
    public final ArrayList o = new ArrayList();

    public oz(Context context) {
        this.a = context;
        int i3 = h10.t0;
        this.c = i3;
        this.d = g0.b1(hp.s1(i3).d7, "auto_lastSelectedDialog", 0L);
        android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(context, "TelegramMediaSession", (ComponentName) null, (PendingIntent) null);
        this.b = a0Var;
        android.support.v4.media.session.u uVar = (android.support.v4.media.session.u) a0Var.b;
        uVar.a.setFlags(3);
        a0Var.r(new nz(this), null);
        uVar.a.setSessionActivity(PendingIntent.getActivity(context, 99, new Intent(context, (Class<?>) LaunchActivity.class), 167772160));
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_QUEUE", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        uVar.a.setExtras(bundle);
        a0Var.q(true);
        ArrayList arrayList = new ArrayList();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        zi ziVar = MediaController.B().v0;
        if (ziVar != null) {
            r3 = MediaController.B().H() ? 2477828L : 2477830L;
            if (ziVar.J3()) {
                r3 |= 48;
            }
        }
        a0Var.t(new PlaybackStateCompat(0, 0L, 0L, 1.0f, r3, 0, null, elapsedRealtime, arrayList, -1L, null));
        f();
        a0Var.w(az.N0 ? 1 : 0);
        hs.e().b(new h5(this, 1), hs.c4);
    }

    public static oz a(MusicBrowserService musicBrowserService) {
        if (p == null) {
            synchronized (oz.class) {
                try {
                    if (p == null) {
                        p = new oz(musicBrowserService.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return p;
    }

    public static boolean b() {
        int i3;
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        if (az.s.length() <= 0) {
            return false;
        }
        if (az.x) {
            return true;
        }
        return !(az.y == 0 || (i3 = az.B) == 0 || i3 + az.y > elapsedRealtime) || elapsedRealtime + 5 < az.B;
    }

    public final void c(String str, p1 p1Var) {
        long j10;
        if (!this.e) {
            this.o.add(new lz(str, p1Var));
            if (this.f) {
                return;
            }
            this.f = true;
            int i3 = this.c;
            qr a02 = qr.a0(i3);
            a02.a.c(new k7(this, a02, i3, 22));
            return;
        }
        if (str != null && str.startsWith("__CHAT_")) {
            try {
                j10 = Long.parseLong(str.substring(7));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            if (j10 == 0 && this.j.f(j10) == null) {
                e(new dg((Object) this, (Object) p1Var, str, 29), j10);
                return;
            } else {
                ((MediaBrowserService.Result) p1Var.b).sendResult(d(str));
            }
        }
        j10 = 0;
        if (j10 == 0) {
        }
        ((MediaBrowserService.Result) p1Var.b).sendResult(d(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0062, code lost:
    
        if ((r0 instanceof org.telegram.tgnet.TLRPC.TL_fileLocationUnavailable) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0085, code lost:
    
        if ((r0 instanceof org.telegram.tgnet.TLRPC.TL_fileLocationUnavailable) == false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList d(String str) {
        long j10;
        TLRPC.FileLocation fileLocation;
        TLRPC.FileLocation fileLocation2;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        if ("__ROOT__".equals(str)) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList2 = this.g;
                if (i10 >= arrayList2.size()) {
                    break;
                }
                long longValue = ((Long) arrayList2.get(i10)).longValue();
                MediaDescription.Builder mediaId = new MediaDescription.Builder().setMediaId("__CHAT_" + longValue);
                Bitmap bitmap = null;
                if (m5.E(longValue)) {
                    TLRPC.User user = (TLRPC.User) this.h.f(longValue);
                    if (user != null) {
                        mediaId.setTitle(g5.m(i3, user.first_name, user.last_name));
                        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                        if (userProfilePhoto != null) {
                            fileLocation2 = userProfilePhoto.photo_small;
                        }
                    } else {
                        mediaId.setTitle("DELETED USER");
                    }
                    fileLocation2 = null;
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) this.i.f(-longValue);
                    if (chat != null) {
                        mediaId.setTitle(chat.title);
                        TLRPC.ChatPhoto chatPhoto = chat.photo;
                        if (chatPhoto != null) {
                            fileLocation2 = chatPhoto.photo_small;
                        }
                    } else {
                        mediaId.setTitle("DELETED CHAT");
                    }
                    fileLocation = null;
                    if (fileLocation != null) {
                        w7.G(this.c);
                        File K = w7.K(fileLocation, null, true, true);
                        try {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inSampleSize = 2;
                            Bitmap decodeFile = BitmapFactory.decodeFile(K.toString(), options);
                            if (decodeFile != null) {
                                Bitmap createBitmap = Bitmap.createBitmap(decodeFile.getWidth(), decodeFile.getHeight(), Bitmap.Config.ARGB_8888);
                                createBitmap.eraseColor(i3);
                                Canvas canvas = new Canvas(createBitmap);
                                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                BitmapShader bitmapShader = new BitmapShader(decodeFile, tileMode, tileMode);
                                if (this.m == null) {
                                    this.m = new Paint(1);
                                    this.n = new RectF();
                                }
                                this.m.setShader(bitmapShader);
                                this.n.set(0.0f, 0.0f, decodeFile.getWidth(), decodeFile.getHeight());
                                canvas.drawRoundRect(this.n, decodeFile.getWidth(), decodeFile.getHeight(), this.m);
                                bitmap = createBitmap;
                            }
                        } catch (Throwable th2) {
                            a8.g(th2, true);
                        }
                        if (bitmap != null) {
                            mediaId.setIconBitmap(bitmap);
                        }
                    }
                    if (fileLocation != null || bitmap == null) {
                        mediaId.setIconUri(Uri.parse("android.resource://" + this.a.getPackageName() + "/drawable/contact_blue"));
                    }
                    arrayList.add(new MediaBrowser.MediaItem(mediaId.build(), 1));
                    i10++;
                    i3 = 0;
                }
                fileLocation = fileLocation2;
                if (fileLocation != null) {
                }
                if (fileLocation != null) {
                }
                mediaId.setIconUri(Uri.parse("android.resource://" + this.a.getPackageName() + "/drawable/contact_blue"));
                arrayList.add(new MediaBrowser.MediaItem(mediaId.build(), 1));
                i10++;
                i3 = 0;
            }
        } else if (str != null && str.startsWith("__CHAT_")) {
            try {
                j10 = Long.parseLong(str.replace("__CHAT_", ""));
            } catch (Exception e10) {
                a8.g(e10, true);
                j10 = 0;
            }
            ArrayList arrayList3 = (ArrayList) this.j.f(j10);
            if (arrayList3 != null) {
                for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                    zi ziVar = (zi) arrayList3.get(i11);
                    MediaDescription.Builder mediaId2 = new MediaDescription.Builder().setMediaId(j10 + "_" + i11);
                    mediaId2.setTitle(ziVar.z1(true));
                    mediaId2.setSubtitle(ziVar.x1(true));
                    arrayList.add(new MediaBrowser.MediaItem(mediaId2.build(), 2));
                }
            }
        }
        return arrayList;
    }

    public final void e(Runnable runnable, long j10) {
        a0.h hVar = this.l;
        ArrayList arrayList = (ArrayList) hVar.f(j10);
        if (arrayList != null) {
            arrayList.add(runnable);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(runnable);
        hVar.k(arrayList2, j10);
        int i3 = this.c;
        qr a02 = qr.a0(i3);
        a02.a.c(new yj(i3, 11, j10, this, a02));
    }

    public final void f() {
        int i3 = az.S0;
        this.b.v(i3 != 1 ? i3 != 2 ? 0 : 1 : 2);
    }
}
