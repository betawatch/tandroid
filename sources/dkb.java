// default package

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
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MusicBrowserService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class dkb {
    public static volatile dkb p;
    public final Context a;
    public final rx6 b;
    public int c;
    public long d;
    public boolean e;
    public boolean f;
    public Paint m;
    public RectF n;
    public final ArrayList g = new ArrayList();
    public final zh6 h = new zh6();
    public final zh6 i = new zh6();
    public final zh6 j = new zh6();
    public final zh6 k = new zh6();
    public final zh6 l = new zh6();
    public final ArrayList o = new ArrayList();

    public dkb(Context context) {
        this.a = context;
        int i = yac.t0;
        this.c = i;
        this.d = hl.a1(uc7.s1(i).W3, "auto_lastSelectedDialog", 0L);
        rx6 rx6Var = new rx6(context, "TelegramMediaSession", (ComponentName) null, (PendingIntent) null);
        this.b = rx6Var;
        ex6 ex6Var = (ex6) rx6Var.b;
        ex6Var.a.setFlags(3);
        rx6Var.p0(new ckb(this), null);
        ex6Var.a.setSessionActivity(PendingIntent.getActivity(context, 99, new Intent(context, (Class<?>) LaunchActivity.class), 167772160));
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_QUEUE", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        ex6Var.a.setExtras(bundle);
        rx6Var.n0(true);
        ArrayList arrayList = new ArrayList();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        r47 r47Var = MediaController.z().v0;
        if (r47Var != null) {
            r3 = MediaController.z().G() ? 2477828L : 2477830L;
            if (r47Var.I3()) {
                r3 |= 48;
            }
        }
        rx6Var.s0(new PlaybackStateCompat(0, 0L, 0L, 1.0f, r3, 0, null, elapsedRealtime, arrayList, -1L, null));
        f();
        rx6Var.v0(xea.J0 ? 1 : 0);
        jn7.e().a(new nv2(this, (byte) 4), jn7.f4);
    }

    public static dkb a(MusicBrowserService musicBrowserService) {
        if (p == null) {
            synchronized (dkb.class) {
                if (p == null) {
                    p = new dkb(musicBrowserService.getApplicationContext());
                }
            }
        }
        return p;
    }

    public static boolean b() {
        int i;
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        if (xea.r.length() <= 0) {
            return false;
        }
        if (xea.w) {
            return true;
        }
        return !(xea.x == 0 || (i = xea.A) == 0 || i + xea.x > elapsedRealtime) || elapsedRealtime + 5 < xea.A;
    }

    public final void c(String str, bm6 bm6Var) {
        long j;
        if (!this.e) {
            this.o.add(new bkb(str, bm6Var));
            if (this.f) {
                return;
            }
            this.f = true;
            int i = this.c;
            jf7 Y = jf7.Y(i);
            Y.a.c(new a39(this, Y, i, (byte) 23));
            return;
        }
        if (str != null && str.startsWith("__CHAT_")) {
            try {
                j = Long.parseLong(str.substring(7));
            } catch (Exception e) {
                cc4.g(e, true);
            }
            if (j == 0 && this.j.f(j) == null) {
                e(new pwa(this, bm6Var, str, (byte) 18), j);
                return;
            } else {
                ((MediaBrowserService.Result) bm6Var.b).sendResult(d(str));
            }
        }
        j = 0;
        if (j == 0) {
        }
        ((MediaBrowserService.Result) bm6Var.b).sendResult(d(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0062, code lost:
    
        if ((r0 instanceof org.telegram.tgnet.TLRPC.TL_fileLocationUnavailable) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0084, code lost:
    
        if ((r0 instanceof org.telegram.tgnet.TLRPC.TL_fileLocationUnavailable) == false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList d(String str) {
        long j;
        TLRPC.FileLocation fileLocation;
        TLRPC.FileLocation fileLocation2;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if ("__ROOT__".equals(str)) {
            int i2 = 0;
            while (true) {
                ArrayList arrayList2 = this.g;
                if (i2 >= arrayList2.size()) {
                    break;
                }
                long longValue = ((Long) arrayList2.get(i2)).longValue();
                MediaDescription.Builder mediaId = new MediaDescription.Builder().setMediaId("__CHAT_" + longValue);
                Bitmap bitmap = null;
                if (wf3.D(longValue)) {
                    TLRPC.User user = (TLRPC.User) this.h.f(longValue);
                    if (user != null) {
                        mediaId.setTitle(lv2.m(i, user.first_name, user.last_name));
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
                        xb4.G(this.c);
                        File J = xb4.J(fileLocation, null, true, true);
                        try {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inSampleSize = 2;
                            Bitmap decodeFile = BitmapFactory.decodeFile(J.toString(), options);
                            if (decodeFile != null) {
                                Bitmap createBitmap = Bitmap.createBitmap(decodeFile.getWidth(), decodeFile.getHeight(), Bitmap.Config.ARGB_8888);
                                createBitmap.eraseColor(i);
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
                        } catch (Throwable th) {
                            cc4.g(th, true);
                        }
                        if (bitmap != null) {
                            mediaId.setIconBitmap(bitmap);
                        }
                    }
                    if (fileLocation != null || bitmap == null) {
                        mediaId.setIconUri(Uri.parse("android.resource://" + this.a.getPackageName() + "/drawable/contact_blue"));
                    }
                    arrayList.add(new MediaBrowser.MediaItem(mediaId.build(), 1));
                    i2++;
                    i = 0;
                }
                fileLocation = fileLocation2;
                if (fileLocation != null) {
                }
                if (fileLocation != null) {
                }
                mediaId.setIconUri(Uri.parse("android.resource://" + this.a.getPackageName() + "/drawable/contact_blue"));
                arrayList.add(new MediaBrowser.MediaItem(mediaId.build(), 1));
                i2++;
                i = 0;
            }
        } else if (str != null && str.startsWith("__CHAT_")) {
            try {
                j = Long.parseLong(str.replace("__CHAT_", ""));
            } catch (Exception e) {
                cc4.g(e, true);
                j = 0;
            }
            ArrayList arrayList3 = (ArrayList) this.j.f(j);
            if (arrayList3 != null) {
                for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                    r47 r47Var = (r47) arrayList3.get(i3);
                    MediaDescription.Builder mediaId2 = new MediaDescription.Builder().setMediaId(j + "_" + i3);
                    mediaId2.setTitle(r47Var.y1(true));
                    mediaId2.setSubtitle(r47Var.w1(true));
                    arrayList.add(new MediaBrowser.MediaItem(mediaId2.build(), 2));
                }
            }
        }
        return arrayList;
    }

    public final void e(Runnable runnable, long j) {
        zh6 zh6Var = this.l;
        ArrayList arrayList = (ArrayList) zh6Var.f(j);
        if (arrayList != null) {
            arrayList.add(runnable);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(runnable);
        zh6Var.k(j, arrayList2);
        int i = this.c;
        jf7 Y = jf7.Y(i);
        Y.a.c(new r77((Object) this, (Object) Y, j, i, (byte) 19));
    }

    public final void f() {
        int i = xea.O0;
        this.b.u0(i != 1 ? i != 2 ? 0 : 1 : 2);
    }
}
