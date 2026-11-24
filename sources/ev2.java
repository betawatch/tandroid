// default package

import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ev2 implements dv2, gv2 {
    public static ev2 g;
    public final /* synthetic */ byte a = 0;
    public Object b;
    public byte c;
    public boolean d;
    public Object e;
    public Object f;

    public ev2(ev2 ev2Var) {
        ClipData clipData = (ClipData) ev2Var.b;
        clipData.getClass();
        this.b = clipData;
        byte b = ev2Var.c;
        if (b < 0) {
            Locale locale = Locale.US;
            w26.j("source is out of range of [0, 5] (too low)");
            throw null;
        }
        if (b > 5) {
            Locale locale2 = Locale.US;
            w26.j("source is out of range of [0, 5] (too high)");
            throw null;
        }
        this.c = b;
        this.d = ev2Var.d;
        this.e = (Uri) ev2Var.e;
        this.f = (Bundle) ev2Var.f;
    }

    public static synchronized ev2 g(Context context) {
        ev2 ev2Var;
        synchronized (ev2.class) {
            ev2Var = g;
            if (ev2Var == null) {
                ev2Var = new ev2(context);
                g = ev2Var;
            }
        }
        return ev2Var;
    }

    @Override // gv2
    public final int a() {
        return this.d ? 1 : 0;
    }

    @Override // gv2
    public final ClipData b() {
        return (ClipData) this.b;
    }

    @Override // dv2
    public final hv2 build() {
        return new hv2(new ev2(this));
    }

    @Override // dv2
    public final void c(Uri uri) {
        this.e = uri;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dv2
    public final void d(int i) {
        this.d = i;
    }

    @Override // gv2
    public final ContentInfo e() {
        return null;
    }

    @Override // gv2
    public final int f() {
        return this.c;
    }

    public final int h() {
        byte b;
        synchronized (this.f) {
            b = this.c;
        }
        return b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(int i) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.e;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            aj7 aj7Var = (aj7) it.next();
            if (aj7Var.a.get() == null) {
                copyOnWriteArrayList.remove(aj7Var);
            }
        }
        synchronized (this.f) {
            if (this.d && this.c == i) {
                return;
            }
            this.d = true;
            this.c = i;
            Iterator it2 = ((CopyOnWriteArrayList) this.e).iterator();
            while (it2.hasNext()) {
                aj7 aj7Var2 = (aj7) it2.next();
                aj7Var2.b.execute(new vl6(aj7Var2, (byte) 22));
            }
        }
    }

    @Override // dv2
    public final void setExtras(Bundle bundle) {
        this.f = bundle;
    }

    public final String toString() {
        String str;
        switch (this.a) {
            case 1:
                Uri uri = (Uri) this.e;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.b).getDescription());
                sb.append(", source=");
                byte b = this.c;
                sb.append(b != 0 ? b != 1 ? b != 2 ? b != 3 ? b != 4 ? b != 5 ? String.valueOf((int) b) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                boolean z = this.d;
                sb.append(z ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(z ? 1 : 0));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return b00.j(sb, ((Bundle) this.f) != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public ev2(Context context) {
        Executor a = pd0.a();
        this.b = a;
        this.e = new CopyOnWriteArrayList();
        this.f = new Object();
        this.c = (byte) 0;
        a.execute(new t67(this, context, (byte) 29));
    }

    public /* synthetic */ ev2() {
    }
}
