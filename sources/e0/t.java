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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class t {
    public f0.h A;
    public int B;
    public final boolean C;
    public r D;
    public final Notification E;
    public final ArrayList F;
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
    public b0 l;
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

    public t(Context context, String str) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.k = true;
        this.t = false;
        this.w = 0;
        this.x = 0;
        this.B = 0;
        Notification notification = new Notification();
        this.E = notification;
        this.a = context;
        this.y = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.j = 0;
        this.F = new ArrayList();
        this.C = true;
    }

    public static CharSequence d(CharSequence charSequence) {
        return charSequence == null ? charSequence : charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final void a(int i10, String str, PendingIntent pendingIntent) {
        this.b.add(new k(i10 != 0 ? IconCompat.e(null, "", i10) : null, str, pendingIntent, new Bundle(), null, null, true, 0, true));
    }

    public final Notification b() {
        Notification build;
        Bundle bundle;
        a4.k kVar = new a4.k(this);
        t tVar = (t) kVar.d;
        b0 b0Var = tVar.l;
        if (b0Var != null) {
            b0Var.b(kVar);
        }
        Notification.Builder builder = (Notification.Builder) kVar.c;
        int i10 = kVar.a;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            build = builder.build();
        } else if (i11 >= 24) {
            build = builder.build();
            if (i10 != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && i10 == 2) {
                    a4.k.d(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && i10 == 1) {
                    a4.k.d(build);
                }
            }
        } else {
            builder.setExtras((Bundle) kVar.e);
            build = builder.build();
            if (i10 != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && i10 == 2) {
                    a4.k.d(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && i10 == 1) {
                    a4.k.d(build);
                }
            }
        }
        if (b0Var != null) {
            tVar.l.getClass();
        }
        if (b0Var != null && (bundle = build.extras) != null) {
            b0Var.a(bundle);
        }
        return build;
    }

    public final void c(g0 g0Var) {
        Notification.Action.Builder d;
        Bundle bundle = new Bundle();
        if (!g0Var.a.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(g0Var.a.size());
            ArrayList arrayList2 = g0Var.a;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                k kVar = (k) obj;
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 23) {
                    IconCompat a2 = kVar.a();
                    d = d0.a(a2 != null ? a2.m(null) : null, kVar.h, kVar.i);
                } else {
                    IconCompat a10 = kVar.a();
                    d = c0.d((a10 == null || a10.i() != 2) ? 0 : a10.g(), kVar.h, kVar.i);
                }
                Bundle bundle2 = kVar.a;
                boolean z4 = kVar.d;
                Bundle bundle3 = bundle2 != null ? new Bundle(kVar.a) : new Bundle();
                bundle3.putBoolean("android.support.allowGeneratedReplies", z4);
                if (i11 >= 24) {
                    e0.a(d, z4);
                }
                if (i11 >= 31) {
                    f0.a(d, false);
                }
                c0.a(d, bundle3);
                q0[] q0VarArr = kVar.c;
                if (q0VarArr != null) {
                    for (RemoteInput remoteInput : q0.a(q0VarArr)) {
                        c0.b(d, remoteInput);
                    }
                }
                arrayList.add(c0.c(d));
            }
            bundle.putParcelableArrayList("actions", arrayList);
        }
        int i12 = g0Var.b;
        if (i12 != 1) {
            bundle.putInt("flags", i12);
        }
        if (!g0Var.c.isEmpty()) {
            ArrayList arrayList3 = g0Var.c;
            bundle.putParcelableArray("pages", (Parcelable[]) arrayList3.toArray(new Notification[arrayList3.size()]));
        }
        int i13 = g0Var.d;
        if (i13 != 8388613) {
            bundle.putInt("contentIconGravity", i13);
        }
        int i14 = g0Var.e;
        if (i14 != -1) {
            bundle.putInt("contentActionIndex", i14);
        }
        int i15 = g0Var.f;
        if (i15 != 80) {
            bundle.putInt("gravity", i15);
        }
        String str = g0Var.g;
        if (str != null) {
            bundle.putString("dismissalId", str);
        }
        String str2 = g0Var.h;
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

    public final void h(int i10, boolean z4) {
        Notification notification = this.E;
        if (z4) {
            notification.flags = i10 | notification.flags;
        } else {
            notification.flags = (~i10) & notification.flags;
        }
    }

    public final void i() {
        this.B = 1;
    }

    public final void j(Bitmap bitmap) {
        IconCompat c3;
        if (bitmap == null) {
            c3 = null;
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
            c3 = IconCompat.c(bitmap);
        }
        this.h = c3;
    }

    public final void k() {
        this.t = true;
    }

    public final void l(String str) {
        this.s = str;
    }

    public final void m(Uri uri) {
        Notification notification = this.E;
        notification.sound = uri;
        notification.audioStreamType = 5;
        notification.audioAttributes = s.a(s.d(s.c(s.b(), 4), 5));
    }

    public final void n(b0 b0Var) {
        if (this.l != b0Var) {
            this.l = b0Var;
            if (b0Var.a != this) {
                b0Var.a = this;
                n(b0Var);
            }
        }
    }

    public final void o(String str) {
        this.m = d(str);
    }

    public final void p(String str) {
        this.E.tickerText = d(str);
    }

    public t(Context context) {
        this(context, null);
    }
}
