package e0;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class q {
    public f0.g A;
    public long B;
    public int C;
    public final boolean D;
    public o E;
    public final Notification F;
    public final ArrayList G;
    public final Context a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public IconCompat h;
    public int i;
    public int j;
    public boolean k;
    public y l;
    public CharSequence m;
    public int n;
    public int o;
    public boolean p;
    public String q;
    public boolean r;
    public String s;
    public boolean t;
    public String u;
    public Bundle v;
    public int w;
    public int x;
    public String y;
    public String z;

    public q(Context context, String str) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.k = true;
        this.t = false;
        this.w = 0;
        this.x = 0;
        this.C = 0;
        Notification notification = new Notification();
        this.F = notification;
        this.a = context;
        this.y = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.j = 0;
        this.G = new ArrayList();
        this.D = true;
    }

    public static CharSequence d(CharSequence charSequence) {
        return charSequence == null ? charSequence : charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final void a(int i7, PendingIntent pendingIntent, String str) {
        this.b.add(new h(i7 != 0 ? IconCompat.e(null, "", i7) : null, str, pendingIntent, new Bundle(), null, null, true, 0, true));
    }

    public final Notification b() {
        Notification build;
        Bundle bundle;
        a4.k kVar = new a4.k(this);
        q qVar = (q) kVar.e;
        y yVar = qVar.l;
        if (yVar != null) {
            yVar.b(kVar);
        }
        Notification.Builder builder = (Notification.Builder) kVar.d;
        int i7 = kVar.b;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            build = builder.build();
        } else if (i10 >= 24) {
            build = builder.build();
            if (i7 != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && i7 == 2) {
                    a4.k.s(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && i7 == 1) {
                    a4.k.s(build);
                }
            }
        } else {
            builder.setExtras((Bundle) kVar.f);
            build = builder.build();
            if (i7 != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && i7 == 2) {
                    a4.k.s(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && i7 == 1) {
                    a4.k.s(build);
                }
            }
        }
        if (yVar != null) {
            qVar.l.getClass();
        }
        if (yVar != null && (bundle = build.extras) != null) {
            yVar.a(bundle);
        }
        return build;
    }

    public final void c(d0 d0Var) {
        Bundle bundle = new Bundle();
        if (!d0Var.a.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(d0Var.a.size());
            ArrayList arrayList2 = d0Var.a;
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                h hVar = (h) obj;
                int i10 = Build.VERSION.SDK_INT;
                IconCompat a10 = hVar.a();
                Bundle bundle2 = hVar.a;
                Notification.Action.Builder a11 = a0.a(a10 != null ? a10.m(null) : null, hVar.h, hVar.i);
                boolean z9 = hVar.d;
                Bundle bundle3 = bundle2 != null ? new Bundle(bundle2) : new Bundle();
                bundle3.putBoolean("android.support.allowGeneratedReplies", z9);
                if (i10 >= 24) {
                    b0.a(a11, z9);
                }
                if (i10 >= 31) {
                    c0.a(a11, false);
                }
                z.a(a11, bundle3);
                l0[] l0VarArr = hVar.c;
                if (l0VarArr != null) {
                    for (RemoteInput remoteInput : l0.a(l0VarArr)) {
                        z.b(a11, remoteInput);
                    }
                }
                arrayList.add(z.c(a11));
            }
            bundle.putParcelableArrayList("actions", arrayList);
        }
        int i11 = d0Var.b;
        if (i11 != 1) {
            bundle.putInt("flags", i11);
        }
        if (!d0Var.c.isEmpty()) {
            ArrayList arrayList3 = d0Var.c;
            bundle.putParcelableArray("pages", (Parcelable[]) arrayList3.toArray(new Notification[arrayList3.size()]));
        }
        int i12 = d0Var.d;
        if (i12 != 8388613) {
            bundle.putInt("contentIconGravity", i12);
        }
        int i13 = d0Var.e;
        if (i13 != -1) {
            bundle.putInt("contentActionIndex", i13);
        }
        int i14 = d0Var.f;
        if (i14 != 80) {
            bundle.putInt("gravity", i14);
        }
        String str = d0Var.g;
        if (str != null) {
            bundle.putString("dismissalId", str);
        }
        String str2 = d0Var.h;
        if (str2 != null) {
            bundle.putString("bridgeTag", str2);
        }
        if (this.v == null) {
            this.v = new Bundle();
        }
        this.v.putBundle("android.wearable.EXTENSIONS", bundle);
    }

    public final void e(String str) {
        this.y = str;
    }

    public final void f(String str) {
        this.f = d(str);
    }

    public final void g(CharSequence charSequence) {
        this.e = d(charSequence);
    }

    public final void h(int i7, boolean z9) {
        Notification notification = this.F;
        if (z9) {
            notification.flags = i7 | notification.flags;
        } else {
            notification.flags = (~i7) & notification.flags;
        }
    }

    public final void i() {
        this.C = 1;
    }

    public final void j(Bitmap bitmap) {
        IconCompat c10;
        if (bitmap == null) {
            c10 = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            c10 = IconCompat.c(bitmap);
        }
        this.h = c10;
    }

    public final void k() {
        this.t = true;
    }

    public final void l(String str) {
        this.s = str;
    }

    public final void m(Uri uri) {
        Notification notification = this.F;
        notification.sound = uri;
        notification.audioStreamType = 5;
        notification.audioAttributes = p.a(p.d(p.c(p.b(), 4), 5));
    }

    public final void n(y yVar) {
        if (this.l != yVar) {
            this.l = yVar;
            if (yVar.a != this) {
                yVar.a = this;
                n(yVar);
            }
        }
    }

    public final void o(String str) {
        this.m = d(str);
    }

    public final void p(String str) {
        this.F.tickerText = d(str);
    }

    public q(Context context) {
        this(context, null);
    }
}
