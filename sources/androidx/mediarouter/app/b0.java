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
import b8.d1;
import java.io.IOException;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b0 extends u4.h0 {
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
        this.e = d1.d(context, R.attr.mediaRouteDefaultIconDrawable);
        this.f = d1.d(context, R.attr.mediaRouteTvIconDrawable);
        this.h = d1.d(context, R.attr.mediaRouteSpeakerIconDrawable);
        this.n = d1.d(context, R.attr.mediaRouteSpeakerGroupIconDrawable);
        D();
    }

    public final void D() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        c0 c0Var = this.r;
        arrayList.add(new y(c0Var.n.getString(R.string.mr_chooser_title)));
        ArrayList arrayList2 = c0Var.s;
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            arrayList.add(new y((r4.w) obj));
        }
        f();
    }

    @Override // u4.h0
    public final int b() {
        return this.c.size();
    }

    @Override // u4.h0
    public final int d(int i3) {
        return ((y) this.c.get(i3)).b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        if (r2 != null) goto L25;
     */
    @Override // u4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u4.d1 d1Var, int i3) {
        Drawable createFromStream;
        int d = d(i3);
        y yVar = (y) this.c.get(i3);
        if (d == 1) {
            ((x) d1Var).v.setText(yVar.a.toString());
            return;
        }
        if (d != 2) {
            Log.w("RecyclerAdapter", "Cannot bind item to ViewHolder because of wrong view type");
            return;
        }
        a0 a0Var = (a0) d1Var;
        r4.w wVar = (r4.w) yVar.a;
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
            } catch (IOException e10) {
                Log.w("RecyclerAdapter", "Failed to load " + uri, e10);
            }
        }
        int i10 = wVar.n;
        createFromStream = i10 != 1 ? i10 != 2 ? wVar.e() ? b0Var.n : b0Var.e : b0Var.h : b0Var.f;
        imageView.setImageDrawable(createFromStream);
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        LayoutInflater layoutInflater = this.d;
        if (i3 != 1) {
            if (i3 == 2) {
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
