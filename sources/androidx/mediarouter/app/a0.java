package androidx.mediarouter.app;

import a8.b7;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.IOException;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import v4.d1;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class a0 extends v4.g0 {
    public final ArrayList c = new ArrayList();
    public final LayoutInflater d;
    public final Drawable e;
    public final Drawable f;
    public final Drawable h;
    public final Drawable n;
    public final /* synthetic */ b0 r;

    public a0(b0 b0Var) {
        this.r = b0Var;
        Context context = b0Var.n;
        this.d = LayoutInflater.from(context);
        this.e = b7.d(context, R.attr.mediaRouteDefaultIconDrawable);
        this.f = b7.d(context, R.attr.mediaRouteTvIconDrawable);
        this.h = b7.d(context, R.attr.mediaRouteSpeakerIconDrawable);
        this.n = b7.d(context, R.attr.mediaRouteSpeakerGroupIconDrawable);
        D();
    }

    public final void D() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        b0 b0Var = this.r;
        arrayList.add(new y(b0Var.n.getString(R.string.mr_chooser_title)));
        ArrayList arrayList2 = b0Var.s;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            arrayList.add(new y((s4.v) obj));
        }
        f();
    }

    @Override // v4.g0
    public final int b() {
        return this.c.size();
    }

    @Override // v4.g0
    public final int d(int i7) {
        return ((y) this.c.get(i7)).b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        if (r2 != null) goto L25;
     */
    @Override // v4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(d1 d1Var, int i7) {
        Drawable createFromStream;
        int d = d(i7);
        y yVar = (y) this.c.get(i7);
        if (d == 1) {
            ((x) d1Var).v.setText(yVar.a.toString());
            return;
        }
        if (d != 2) {
            Log.w("RecyclerAdapter", "Cannot bind item to ViewHolder because of wrong view type");
            return;
        }
        z zVar = (z) d1Var;
        s4.v vVar = (s4.v) yVar.a;
        View view = zVar.v;
        view.setVisibility(0);
        zVar.x.setVisibility(4);
        view.setOnClickListener(new a7.d(zVar, vVar));
        zVar.y.setText(vVar.d);
        ImageView imageView = zVar.w;
        a0 a0Var = zVar.z;
        Uri uri = vVar.f;
        if (uri != null) {
            try {
                createFromStream = Drawable.createFromStream(a0Var.r.n.getContentResolver().openInputStream(uri), null);
            } catch (IOException e10) {
                Log.w("RecyclerAdapter", "Failed to load " + uri, e10);
            }
        }
        int i10 = vVar.n;
        createFromStream = i10 != 1 ? i10 != 2 ? vVar.e() ? a0Var.n : a0Var.e : a0Var.h : a0Var.f;
        imageView.setImageDrawable(createFromStream);
    }

    @Override // v4.g0
    public final d1 x(ViewGroup viewGroup, int i7) {
        LayoutInflater layoutInflater = this.d;
        if (i7 != 1) {
            if (i7 == 2) {
                return new z(this, layoutInflater.inflate(R.layout.mr_picker_route_item, viewGroup, false));
            }
            throw new IllegalStateException();
        }
        View inflate = layoutInflater.inflate(R.layout.mr_picker_header_item, viewGroup, false);
        x xVar = new x(inflate);
        xVar.v = (TextView) inflate.findViewById(R.id.mr_picker_header_name);
        return xVar;
    }
}
