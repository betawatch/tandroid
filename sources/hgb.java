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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class hgb {
    public static volatile hgb p;
    public final Context a;
    public final mv6 b;
    public int c;
    public long d;
    public boolean e;
    public boolean f;
    public Paint m;
    public RectF n;
    public final ArrayList g = new ArrayList();
    public final vf6 h = new vf6();
    public final vf6 i = new vf6();
    public final vf6 j = new vf6();
    public final vf6 k = new vf6();
    public final vf6 l = new vf6();
    public final ArrayList o = new ArrayList();

    public hgb(Context context) {
        this.a = context;
        int i = y6c.t0;
        this.c = i;
        this.d = gl.a1(na7.q1(i).W3, "auto_lastSelectedDialog", 0L);
        mv6 mv6Var = new mv6(context, "TelegramMediaSession", (ComponentName) null, (PendingIntent) null);
        this.b = mv6Var;
        zu6 zu6Var = (zu6) mv6Var.b;
        zu6Var.a.setFlags(3);
        mv6Var.k0(new ggb(this), null);
        zu6Var.a.setSessionActivity(PendingIntent.getActivity(context, 99, new Intent(context, (Class<?>) LaunchActivity.class), 167772160));
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_QUEUE", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        zu6Var.a.setExtras(bundle);
        mv6Var.i0(true);
        ArrayList arrayList = new ArrayList();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        k27 k27Var = MediaController.w().v0;
        if (k27Var != null) {
            r3 = MediaController.w().C() ? 2477828L : 2477830L;
            if (k27Var.I3()) {
                r3 |= 48;
            }
        }
        mv6Var.n0(new PlaybackStateCompat(0, 0L, 0L, 1.0f, r3, 0, null, elapsedRealtime, arrayList, -1L, null));
        f();
        mv6Var.q0(gba.J0 ? 1 : 0);
        kk7.e().a(new su2(this, (byte) 4), kk7.e4);
    }

    public static hgb a(MusicBrowserService musicBrowserService) {
        if (p == null) {
            synchronized (hgb.class) {
                if (p == null) {
                    p = new hgb(musicBrowserService.getApplicationContext());
                }
            }
        }
        return p;
    }

    public static boolean b() {
        int i;
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        if (gba.r.length() <= 0) {
            return false;
        }
        if (gba.w) {
            return true;
        }
        return !(gba.x == 0 || (i = gba.A) == 0 || i + gba.x > elapsedRealtime) || elapsedRealtime + 5 < gba.A;
    }

    public final void c(String str, im6 im6Var) {
        long j;
        if (!this.e) {
            this.o.add(new fgb(str, im6Var));
            if (this.f) {
                return;
            }
            this.f = true;
            int i = this.c;
            ad7 Y = ad7.Y(i);
            Y.a.c(new t79(this, Y, i, (byte) 22));
            return;
        }
        if (str != null && str.startsWith("__CHAT_")) {
            try {
                j = Long.parseLong(str.substring(7));
            } catch (Exception e) {
                fa4.g(e, true);
            }
            if (j == 0 && this.j.f(j) == null) {
                e(new r1b(this, im6Var, str, (byte) 9), j);
                return;
            } else {
                ((MediaBrowserService.Result) im6Var.b).sendResult(d(str));
            }
        }
        j = 0;
        if (j == 0) {
        }
        ((MediaBrowserService.Result) im6Var.b).sendResult(d(str));
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
                if (cf3.D(longValue)) {
                    TLRPC.User user = (TLRPC.User) this.h.f(longValue);
                    if (user != null) {
                        mediaId.setTitle(qu2.m(i, user.first_name, user.last_name));
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
                        ba4.G(this.c);
                        File J = ba4.J(fileLocation, null, true, true);
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
                            fa4.g(th, true);
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
                fa4.g(e, true);
                j = 0;
            }
            ArrayList arrayList3 = (ArrayList) this.j.f(j);
            if (arrayList3 != null) {
                for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                    k27 k27Var = (k27) arrayList3.get(i3);
                    MediaDescription.Builder mediaId2 = new MediaDescription.Builder().setMediaId(j + "_" + i3);
                    mediaId2.setTitle(k27Var.y1(true));
                    mediaId2.setSubtitle(k27Var.w1(true));
                    arrayList.add(new MediaBrowser.MediaItem(mediaId2.build(), 2));
                }
            }
        }
        return arrayList;
    }

    public final void e(Runnable runnable, long j) {
        vf6 vf6Var = this.l;
        ArrayList arrayList = (ArrayList) vf6Var.f(j);
        if (arrayList != null) {
            arrayList.add(runnable);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(runnable);
        vf6Var.k(arrayList2, j);
        int i = this.c;
        ad7 Y = ad7.Y(i);
        Y.a.c(new o57((Object) this, (Object) Y, j, i, (byte) 19));
    }

    public final void f() {
        int i = gba.O0;
        this.b.p0(i != 1 ? i != 2 ? 0 : 1 : 2);
    }
}
