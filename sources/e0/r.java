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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class r {
    public f0.f A;
    public long B;
    public int C;
    public final boolean D;
    public p E;
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
    public z l;
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

    public r(Context context, String str) {
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

    public final void a(int i10, String str, PendingIntent pendingIntent) {
        this.b.add(new i(i10 != 0 ? IconCompat.e(null, "", i10) : null, str, pendingIntent, new Bundle(), null, null, true, 0, true));
    }

    public final Notification b() {
        Notification build;
        Bundle bundle;
        cc.f fVar = new cc.f(this);
        r rVar = (r) fVar.e;
        z zVar = rVar.l;
        if (zVar != null) {
            zVar.b(fVar);
        }
        Notification.Builder builder = (Notification.Builder) fVar.d;
        int i10 = fVar.b;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            build = builder.build();
        } else if (i11 >= 24) {
            build = builder.build();
            if (i10 != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && i10 == 2) {
                    cc.f.e(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && i10 == 1) {
                    cc.f.e(build);
                }
            }
        } else {
            builder.setExtras((Bundle) fVar.f);
            build = builder.build();
            if (i10 != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && i10 == 2) {
                    cc.f.e(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && i10 == 1) {
                    cc.f.e(build);
                }
            }
        }
        if (zVar != null) {
            rVar.l.getClass();
        }
        if (zVar != null && (bundle = build.extras) != null) {
            zVar.a(bundle);
        }
        return build;
    }

    public final void c(e0 e0Var) {
        Bundle bundle = new Bundle();
        if (!e0Var.a.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(e0Var.a.size());
            ArrayList arrayList2 = e0Var.a;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                i iVar = (i) obj;
                int i11 = Build.VERSION.SDK_INT;
                IconCompat a2 = iVar.a();
                Bundle bundle2 = iVar.a;
                Notification.Action.Builder a10 = b0.a(a2 != null ? a2.m(null) : null, iVar.h, iVar.i);
                boolean z10 = iVar.d;
                Bundle bundle3 = bundle2 != null ? new Bundle(bundle2) : new Bundle();
                bundle3.putBoolean("android.support.allowGeneratedReplies", z10);
                if (i11 >= 24) {
                    c0.a(a10, z10);
                }
                if (i11 >= 31) {
                    d0.a(a10, false);
                }
                a0.a(a10, bundle3);
                n0[] n0VarArr = iVar.c;
                if (n0VarArr != null) {
                    for (RemoteInput remoteInput : n0.a(n0VarArr)) {
                        a0.b(a10, remoteInput);
                    }
                }
                arrayList.add(a0.c(a10));
            }
            bundle.putParcelableArrayList("actions", arrayList);
        }
        int i12 = e0Var.b;
        if (i12 != 1) {
            bundle.putInt("flags", i12);
        }
        if (!e0Var.c.isEmpty()) {
            ArrayList arrayList3 = e0Var.c;
            bundle.putParcelableArray("pages", (Parcelable[]) arrayList3.toArray(new Notification[arrayList3.size()]));
        }
        int i13 = e0Var.d;
        if (i13 != 8388613) {
            bundle.putInt("contentIconGravity", i13);
        }
        int i14 = e0Var.e;
        if (i14 != -1) {
            bundle.putInt("contentActionIndex", i14);
        }
        int i15 = e0Var.f;
        if (i15 != 80) {
            bundle.putInt("gravity", i15);
        }
        String str = e0Var.g;
        if (str != null) {
            bundle.putString("dismissalId", str);
        }
        String str2 = e0Var.h;
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

    public final void h(int i10, boolean z10) {
        Notification notification = this.F;
        if (z10) {
            notification.flags = i10 | notification.flags;
        } else {
            notification.flags = (~i10) & notification.flags;
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
        notification.audioAttributes = q.a(q.d(q.c(q.b(), 4), 5));
    }

    public final void n(z zVar) {
        if (this.l != zVar) {
            this.l = zVar;
            if (zVar.a != this) {
                zVar.a = this;
                n(zVar);
            }
        }
    }

    public final void o(String str) {
        this.m = d(str);
    }

    public final void p(String str) {
        this.F.tickerText = d(str);
    }

    public r(Context context) {
        this(context, null);
    }
}
