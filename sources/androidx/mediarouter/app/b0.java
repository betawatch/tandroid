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
import s4.b1;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class b0 extends s4.g0 {
    public final ArrayList c = new ArrayList();
    public final LayoutInflater d;
    public final Drawable e;
    public final Drawable f;
    public final Drawable h;
    public final Drawable n;
    public final /* synthetic */ c0 r;

    public b0(c0 c0Var) {
        this.r = c0Var;
        Context context = c0Var.n;
        this.d = LayoutInflater.from(context);
        this.e = v7.a0.d(context, R.attr.mediaRouteDefaultIconDrawable);
        this.f = v7.a0.d(context, R.attr.mediaRouteTvIconDrawable);
        this.h = v7.a0.d(context, R.attr.mediaRouteSpeakerIconDrawable);
        this.n = v7.a0.d(context, R.attr.mediaRouteSpeakerGroupIconDrawable);
        D();
    }

    public final void D() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        c0 c0Var = this.r;
        arrayList.add(new y(c0Var.n.getString(R.string.mr_chooser_title)));
        ArrayList arrayList2 = c0Var.s;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            arrayList.add(new y((p4.w) obj));
        }
        l();
    }

    @Override // s4.g0
    public final int h() {
        return this.c.size();
    }

    @Override // s4.g0
    public final int j(int i10) {
        return ((y) this.c.get(i10)).b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        if (r2 != null) goto L25;
     */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(b1 b1Var, int i10) {
        Drawable createFromStream;
        int j10 = j(i10);
        y yVar = (y) this.c.get(i10);
        if (j10 == 1) {
            ((x) b1Var).v.setText(yVar.a.toString());
            return;
        }
        if (j10 != 2) {
            Log.w("RecyclerAdapter", "Cannot bind item to ViewHolder because of wrong view type");
            return;
        }
        a0 a0Var = (a0) b1Var;
        p4.w wVar = (p4.w) yVar.a;
        View view = a0Var.v;
        view.setVisibility(0);
        a0Var.x.setVisibility(4);
        view.setOnClickListener(new z(a0Var, wVar));
        a0Var.y.setText(wVar.d);
        ImageView imageView = a0Var.w;
        b0 b0Var = a0Var.z;
        Uri uri = wVar.f;
        if (uri != null) {
            try {
                createFromStream = Drawable.createFromStream(b0Var.r.n.getContentResolver().openInputStream(uri), null);
            } catch (IOException e) {
                Log.w("RecyclerAdapter", "Failed to load " + uri, e);
            }
        }
        int i11 = wVar.n;
        createFromStream = i11 != 1 ? i11 != 2 ? wVar.e() ? b0Var.n : b0Var.e : b0Var.h : b0Var.f;
        imageView.setImageDrawable(createFromStream);
    }

    @Override // s4.g0
    public final b1 x(ViewGroup viewGroup, int i10) {
        LayoutInflater layoutInflater = this.d;
        if (i10 != 1) {
            if (i10 == 2) {
                return new a0(this, layoutInflater.inflate(R.layout.mr_picker_route_item, viewGroup, false));
            }
            throw new IllegalStateException();
        }
        View inflate = layoutInflater.inflate(R.layout.mr_picker_header_item, viewGroup, false);
        x xVar = new x(inflate);
        xVar.v = (TextView) inflate.findViewById(R.id.mr_picker_header_name);
        return xVar;
    }
}
