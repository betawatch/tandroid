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
import f2.o1;
import java.io.IOException;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b0 extends f2.q0 {
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
        this.e = g7.b0.d(context, R.attr.mediaRouteDefaultIconDrawable);
        this.f = g7.b0.d(context, R.attr.mediaRouteTvIconDrawable);
        this.h = g7.b0.d(context, R.attr.mediaRouteSpeakerIconDrawable);
        this.n = g7.b0.d(context, R.attr.mediaRouteSpeakerGroupIconDrawable);
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
            arrayList.add(new y((c2.z) obj));
        }
        l();
    }

    @Override // f2.q0
    public final int h() {
        return this.c.size();
    }

    @Override // f2.q0
    public final int j(int i10) {
        return ((y) this.c.get(i10)).b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        if (r2 != null) goto L25;
     */
    @Override // f2.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(o1 o1Var, int i10) {
        Drawable createFromStream;
        int j10 = j(i10);
        y yVar = (y) this.c.get(i10);
        if (j10 == 1) {
            ((x) o1Var).v.setText(yVar.a.toString());
            return;
        }
        if (j10 != 2) {
            Log.w("RecyclerAdapter", "Cannot bind item to ViewHolder because of wrong view type");
            return;
        }
        a0 a0Var = (a0) o1Var;
        c2.z zVar = (c2.z) yVar.a;
        View view = a0Var.v;
        view.setVisibility(0);
        a0Var.x.setVisibility(4);
        view.setOnClickListener(new z(a0Var, zVar));
        a0Var.y.setText(zVar.d);
        ImageView imageView = a0Var.w;
        b0 b0Var = a0Var.z;
        Uri uri = zVar.f;
        if (uri != null) {
            try {
                createFromStream = Drawable.createFromStream(b0Var.r.n.getContentResolver().openInputStream(uri), null);
            } catch (IOException e9) {
                Log.w("RecyclerAdapter", "Failed to load " + uri, e9);
            }
        }
        int i11 = zVar.n;
        createFromStream = i11 != 1 ? i11 != 2 ? zVar.e() ? b0Var.n : b0Var.e : b0Var.h : b0Var.f;
        imageView.setImageDrawable(createFromStream);
    }

    @Override // f2.q0
    public final o1 x(ViewGroup viewGroup, int i10) {
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
