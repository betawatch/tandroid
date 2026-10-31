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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class h00 {
    public static volatile h00 p;
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

    public h00(Context context) {
        this.a = context;
        int i10 = d20.s0;
        this.c = i10;
        this.d = i0.b1(vp.r1(i10).e7, "auto_lastSelectedDialog", 0L);
        android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(context, "TelegramMediaSession", (ComponentName) null, (PendingIntent) null);
        this.b = a0Var;
        android.support.v4.media.session.u uVar = (android.support.v4.media.session.u) a0Var.b;
        uVar.a.setFlags(3);
        a0Var.z(new g00(this), null);
        uVar.a.setSessionActivity(PendingIntent.getActivity(context, 99, new Intent(context, (Class<?>) LaunchActivity.class), 167772160));
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_QUEUE", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        uVar.a.setExtras(bundle);
        a0Var.x(true);
        ArrayList arrayList = new ArrayList();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        jj jjVar = MediaController.B().u0;
        if (jjVar != null) {
            r3 = MediaController.B().H() ? 2477828L : 2477830L;
            if (jjVar.I3()) {
                r3 |= 48;
            }
        }
        a0Var.C(new PlaybackStateCompat(0, 0L, 0L, 1.0f, r3, 0, null, elapsedRealtime, arrayList, -1L, null));
        f();
        a0Var.F(tz.N0 ? 1 : 0);
        zs.e().b(new j5(this, 1), zs.c4);
    }

    public static h00 a(MusicBrowserService musicBrowserService) {
        if (p == null) {
            synchronized (h00.class) {
                try {
                    if (p == null) {
                        p = new h00(musicBrowserService.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return p;
    }

    public static boolean b() {
        int i10;
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        if (tz.s.length() <= 0) {
            return false;
        }
        if (tz.x) {
            return true;
        }
        return !(tz.y == 0 || (i10 = tz.B) == 0 || i10 + tz.y > elapsedRealtime) || elapsedRealtime + 5 < tz.B;
    }

    public final void c(String str, s1 s1Var) {
        long j10;
        if (!this.e) {
            this.o.add(new f00(str, s1Var));
            if (this.f) {
                return;
            }
            this.f = true;
            int i10 = this.c;
            hs a02 = hs.a0(i10);
            a02.a.c(new o7(this, a02, i10, 22));
            return;
        }
        if (str != null && str.startsWith("__CHAT_")) {
            try {
                j10 = Long.parseLong(str.substring(7));
            } catch (Exception e) {
                f8.g(e, true);
            }
            if (j10 == 0 && this.j.f(j10) == null) {
                e(new e00(this, s1Var, str, 0), j10);
                return;
            } else {
                ((MediaBrowserService.Result) s1Var.b).sendResult(d(str));
            }
        }
        j10 = 0;
        if (j10 == 0) {
        }
        ((MediaBrowserService.Result) s1Var.b).sendResult(d(str));
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
        int i10 = 0;
        if ("__ROOT__".equals(str)) {
            int i11 = 0;
            while (true) {
                ArrayList arrayList2 = this.g;
                if (i11 >= arrayList2.size()) {
                    break;
                }
                long longValue = ((Long) arrayList2.get(i11)).longValue();
                MediaDescription.Builder mediaId = new MediaDescription.Builder().setMediaId("__CHAT_" + longValue);
                Bitmap bitmap = null;
                if (o5.E(longValue)) {
                    TLRPC.User user = (TLRPC.User) this.h.f(longValue);
                    if (user != null) {
                        mediaId.setTitle(i5.m(i10, user.first_name, user.last_name));
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
                        b8.G(this.c);
                        File K = b8.K(fileLocation, null, true, true);
                        try {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inSampleSize = 2;
                            Bitmap decodeFile = BitmapFactory.decodeFile(K.toString(), options);
                            if (decodeFile != null) {
                                Bitmap createBitmap = Bitmap.createBitmap(decodeFile.getWidth(), decodeFile.getHeight(), Bitmap.Config.ARGB_8888);
                                createBitmap.eraseColor(i10);
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
                            f8.g(th2, true);
                        }
                        if (bitmap != null) {
                            mediaId.setIconBitmap(bitmap);
                        }
                    }
                    if (fileLocation != null || bitmap == null) {
                        mediaId.setIconUri(Uri.parse("android.resource://" + this.a.getPackageName() + "/drawable/contact_blue"));
                    }
                    arrayList.add(new MediaBrowser.MediaItem(mediaId.build(), 1));
                    i11++;
                    i10 = 0;
                }
                fileLocation = fileLocation2;
                if (fileLocation != null) {
                }
                if (fileLocation != null) {
                }
                mediaId.setIconUri(Uri.parse("android.resource://" + this.a.getPackageName() + "/drawable/contact_blue"));
                arrayList.add(new MediaBrowser.MediaItem(mediaId.build(), 1));
                i11++;
                i10 = 0;
            }
        } else if (str != null && str.startsWith("__CHAT_")) {
            try {
                j10 = Long.parseLong(str.replace("__CHAT_", ""));
            } catch (Exception e) {
                f8.g(e, true);
                j10 = 0;
            }
            ArrayList arrayList3 = (ArrayList) this.j.f(j10);
            if (arrayList3 != null) {
                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                    jj jjVar = (jj) arrayList3.get(i12);
                    MediaDescription.Builder mediaId2 = new MediaDescription.Builder().setMediaId(j10 + "_" + i12);
                    mediaId2.setTitle(jjVar.z1(true));
                    mediaId2.setSubtitle(jjVar.x1(true));
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
        int i10 = this.c;
        hs a02 = hs.a0(i10);
        a02.a.c(new rk(i10, 11, j10, this, a02));
    }

    public final void f() {
        int i10 = tz.S0;
        this.b.E(i10 != 1 ? i10 != 2 ? 0 : 1 : 2);
    }
}
