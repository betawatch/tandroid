package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import f2.q1;
import java.io.IOException;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d0 extends f2.r0 {
    public final ArrayList c = new ArrayList();
    public final LayoutInflater d;
    public final Drawable e;
    public final Drawable f;
    public final Drawable h;
    public final Drawable n;
    public final /* synthetic */ e0 r;

    public d0(e0 e0Var) {
        this.r = e0Var;
        Context context = e0Var.n;
        this.d = LayoutInflater.from(context);
        this.e = f7.d0.d(context, R.attr.mediaRouteDefaultIconDrawable);
        this.f = f7.d0.d(context, R.attr.mediaRouteTvIconDrawable);
        this.h = f7.d0.d(context, R.attr.mediaRouteSpeakerIconDrawable);
        this.n = f7.d0.d(context, R.attr.mediaRouteSpeakerGroupIconDrawable);
        D();
    }

    public final void D() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        e0 e0Var = this.r;
        arrayList.add(new a0(e0Var.n.getString(R.string.mr_chooser_title)));
        ArrayList arrayList2 = e0Var.s;
        int size = arrayList2.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList2.get(i9);
            i9++;
            arrayList.add(new a0((c2.a0) obj));
        }
        l();
    }

    @Override // f2.r0
    public final int h() {
        return this.c.size();
    }

    @Override // f2.r0
    public final int j(int i9) {
        return ((a0) this.c.get(i9)).b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        if (r2 != null) goto L25;
     */
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(q1 q1Var, int i9) {
        Drawable createFromStream;
        int j10 = j(i9);
        a0 a0Var = (a0) this.c.get(i9);
        if (j10 == 1) {
            ((z) q1Var).v.setText(a0Var.a.toString());
            return;
        }
        if (j10 != 2) {
            Log.w("RecyclerAdapter", "Cannot bind item to ViewHolder because of wrong view type");
            return;
        }
        c0 c0Var = (c0) q1Var;
        c2.a0 a0Var2 = (c2.a0) a0Var.a;
        View view = c0Var.v;
        view.setVisibility(0);
        c0Var.x.setVisibility(4);
        view.setOnClickListener(new b0(c0Var, a0Var2));
        c0Var.y.setText(a0Var2.d);
        ImageView imageView = c0Var.w;
        d0 d0Var = c0Var.z;
        Uri uri = a0Var2.f;
        if (uri != null) {
            try {
                createFromStream = Drawable.createFromStream(d0Var.r.n.getContentResolver().openInputStream(uri), null);
            } catch (IOException e10) {
                Log.w("RecyclerAdapter", "Failed to load " + uri, e10);
            }
        }
        int i10 = a0Var2.n;
        createFromStream = i10 != 1 ? i10 != 2 ? a0Var2.e() ? d0Var.n : d0Var.e : d0Var.h : d0Var.f;
        imageView.setImageDrawable(createFromStream);
    }

    @Override // f2.r0
    public final q1 x(ViewGroup viewGroup, int i9) {
        LayoutInflater layoutInflater = this.d;
        if (i9 != 1) {
            if (i9 == 2) {
                return new c0(this, layoutInflater.inflate(R.layout.mr_picker_route_item, viewGroup, false));
            }
            throw new IllegalStateException();
        }
        View inflate = layoutInflater.inflate(R.layout.mr_picker_header_item, viewGroup, false);
        z zVar = new z(inflate);
        zVar.v = (TextView) inflate.findViewById(R.id.mr_picker_header_name);
        return zVar;
    }
}
