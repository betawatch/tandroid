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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class wz {
    public static volatile wz p;
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

    public wz(Context context) {
        this.a = context;
        int i7 = p10.s0;
        this.c = i7;
        this.d = g0.b1(qp.s1(i7).d7, "auto_lastSelectedDialog", 0L);
        android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(context, "TelegramMediaSession", (ComponentName) null, (PendingIntent) null);
        this.b = a0Var;
        android.support.v4.media.session.u uVar = (android.support.v4.media.session.u) a0Var.b;
        uVar.a.setFlags(3);
        a0Var.s(new vz(this), null);
        uVar.a.setSessionActivity(PendingIntent.getActivity(context, 99, new Intent(context, (Class<?>) LaunchActivity.class), 167772160));
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_QUEUE", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        uVar.a.setExtras(bundle);
        a0Var.r(true);
        ArrayList arrayList = new ArrayList();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ij ijVar = MediaController.B().u0;
        if (ijVar != null) {
            r3 = MediaController.B().H() ? 2477828L : 2477830L;
            if (ijVar.J3()) {
                r3 |= 48;
            }
        }
        a0Var.u(new PlaybackStateCompat(0, 0L, 0L, 1.0f, r3, 0, null, elapsedRealtime, arrayList, -1L, null));
        f();
        a0Var.x(iz.N0 ? 1 : 0);
        qs.e().b(new h5(this, 1), qs.c4);
    }

    public static wz a(MusicBrowserService musicBrowserService) {
        if (p == null) {
            synchronized (wz.class) {
                try {
                    if (p == null) {
                        p = new wz(musicBrowserService.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return p;
    }

    public static boolean b() {
        int i7;
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        if (iz.s.length() <= 0) {
            return false;
        }
        if (iz.x) {
            return true;
        }
        return !(iz.y == 0 || (i7 = iz.B) == 0 || i7 + iz.y > elapsedRealtime) || elapsedRealtime + 5 < iz.B;
    }

    public final void c(String str, j1 j1Var) {
        long j3;
        if (!this.e) {
            this.o.add(new tz(str, j1Var));
            if (this.f) {
                return;
            }
            this.f = true;
            int i7 = this.c;
            yr a02 = yr.a0(i7);
            a02.a.c(new l7(this, a02, i7, 22));
            return;
        }
        if (str != null && str.startsWith("__CHAT_")) {
            try {
                j3 = Long.parseLong(str.substring(7));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            if (j3 == 0 && this.j.f(j3) == null) {
                e(new lg((Object) this, (Object) j1Var, str, 29), j3);
                return;
            } else {
                ((MediaBrowserService.Result) j1Var.b).sendResult(d(str));
            }
        }
        j3 = 0;
        if (j3 == 0) {
        }
        ((MediaBrowserService.Result) j1Var.b).sendResult(d(str));
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
        long j3;
        TLRPC.FileLocation fileLocation;
        TLRPC.FileLocation fileLocation2;
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
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
                        mediaId.setTitle(g5.m(i7, user.first_name, user.last_name));
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
                        File J = w7.J(fileLocation, null, true, true);
                        try {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inSampleSize = 2;
                            Bitmap decodeFile = BitmapFactory.decodeFile(J.toString(), options);
                            if (decodeFile != null) {
                                Bitmap createBitmap = Bitmap.createBitmap(decodeFile.getWidth(), decodeFile.getHeight(), Bitmap.Config.ARGB_8888);
                                createBitmap.eraseColor(i7);
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
                    i7 = 0;
                }
                fileLocation = fileLocation2;
                if (fileLocation != null) {
                }
                if (fileLocation != null) {
                }
                mediaId.setIconUri(Uri.parse("android.resource://" + this.a.getPackageName() + "/drawable/contact_blue"));
                arrayList.add(new MediaBrowser.MediaItem(mediaId.build(), 1));
                i10++;
                i7 = 0;
            }
        } else if (str != null && str.startsWith("__CHAT_")) {
            try {
                j3 = Long.parseLong(str.replace("__CHAT_", ""));
            } catch (Exception e10) {
                a8.g(e10, true);
                j3 = 0;
            }
            ArrayList arrayList3 = (ArrayList) this.j.f(j3);
            if (arrayList3 != null) {
                for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                    ij ijVar = (ij) arrayList3.get(i11);
                    MediaDescription.Builder mediaId2 = new MediaDescription.Builder().setMediaId(j3 + "_" + i11);
                    mediaId2.setTitle(ijVar.z1(true));
                    mediaId2.setSubtitle(ijVar.x1(true));
                    arrayList.add(new MediaBrowser.MediaItem(mediaId2.build(), 2));
                }
            }
        }
        return arrayList;
    }

    public final void e(Runnable runnable, long j3) {
        a0.h hVar = this.l;
        ArrayList arrayList = (ArrayList) hVar.f(j3);
        if (arrayList != null) {
            arrayList.add(runnable);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(runnable);
        hVar.k(arrayList2, j3);
        int i7 = this.c;
        yr a02 = yr.a0(i7);
        a02.a.c(new hk(i7, 11, j3, this, a02));
    }

    public final void f() {
        int i7 = iz.S0;
        this.b.w(i7 != 1 ? i7 != 2 ? 0 : 1 : 2);
    }
}
