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
import java.io.IOException;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import s4.c1;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class c0 extends s4.h0 {
    public final ArrayList c = new ArrayList();
    public final LayoutInflater d;
    public final Drawable e;
    public final Drawable f;
    public final Drawable h;
    public final Drawable n;
    public final /* synthetic */ d0 r;

    public c0(d0 d0Var) {
        this.r = d0Var;
        Context context = d0Var.n;
        this.d = LayoutInflater.from(context);
        this.e = v7.d0.d(context, R.attr.mediaRouteDefaultIconDrawable);
        this.f = v7.d0.d(context, R.attr.mediaRouteTvIconDrawable);
        this.h = v7.d0.d(context, R.attr.mediaRouteSpeakerIconDrawable);
        this.n = v7.d0.d(context, R.attr.mediaRouteSpeakerGroupIconDrawable);
        D();
    }

    public final void D() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        d0 d0Var = this.r;
        arrayList.add(new z(d0Var.n.getString(R.string.mr_chooser_title)));
        ArrayList arrayList2 = d0Var.s;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            arrayList.add(new z((p4.v) obj));
        }
        l();
    }

    @Override // s4.h0
    public final int h() {
        return this.c.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return ((z) this.c.get(i10)).b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        if (r2 != null) goto L25;
     */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(c1 c1Var, int i10) {
        Drawable createFromStream;
        int j3 = j(i10);
        z zVar = (z) this.c.get(i10);
        if (j3 == 1) {
            ((y) c1Var).v.setText(zVar.a.toString());
            return;
        }
        if (j3 != 2) {
            Log.w("RecyclerAdapter", "Cannot bind item to ViewHolder because of wrong view type");
            return;
        }
        b0 b0Var = (b0) c1Var;
        p4.v vVar = (p4.v) zVar.a;
        View view = b0Var.v;
        view.setVisibility(0);
        b0Var.x.setVisibility(4);
        view.setOnClickListener(new a0(b0Var, vVar));
        b0Var.y.setText(vVar.d);
        ImageView imageView = b0Var.w;
        c0 c0Var = b0Var.z;
        Uri uri = vVar.f;
        if (uri != null) {
            try {
                createFromStream = Drawable.createFromStream(c0Var.r.n.getContentResolver().openInputStream(uri), null);
            } catch (IOException e7) {
                Log.w("RecyclerAdapter", "Failed to load " + uri, e7);
            }
        }
        int i11 = vVar.n;
        createFromStream = i11 != 1 ? i11 != 2 ? vVar.e() ? c0Var.n : c0Var.e : c0Var.h : c0Var.f;
        imageView.setImageDrawable(createFromStream);
    }

    @Override // s4.h0
    public final c1 x(ViewGroup viewGroup, int i10) {
        LayoutInflater layoutInflater = this.d;
        if (i10 != 1) {
            if (i10 == 2) {
                return new b0(this, layoutInflater.inflate(R.layout.mr_picker_route_item, viewGroup, false));
            }
            throw new IllegalStateException();
        }
        View inflate = layoutInflater.inflate(R.layout.mr_picker_header_item, viewGroup, false);
        y yVar = new y(inflate);
        yVar.v = (TextView) inflate.findViewById(R.id.mr_picker_header_name);
        return yVar;
    }
}
