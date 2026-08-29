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
import f2.n1;
import h7.e5;
import java.io.IOException;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a0 extends f2.p0 {
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
        this.e = e5.d(context, R.attr.mediaRouteDefaultIconDrawable);
        this.f = e5.d(context, R.attr.mediaRouteTvIconDrawable);
        this.h = e5.d(context, R.attr.mediaRouteSpeakerIconDrawable);
        this.n = e5.d(context, R.attr.mediaRouteSpeakerGroupIconDrawable);
        D();
    }

    public final void D() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        b0 b0Var = this.r;
        arrayList.add(new x(b0Var.n.getString(R.string.mr_chooser_title)));
        ArrayList arrayList2 = b0Var.s;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            arrayList.add(new x((c2.b0) obj));
        }
        l();
    }

    @Override // f2.p0
    public final int h() {
        return this.c.size();
    }

    @Override // f2.p0
    public final int j(int i10) {
        return ((x) this.c.get(i10)).b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        if (r2 != null) goto L25;
     */
    @Override // f2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(n1 n1Var, int i10) {
        Drawable createFromStream;
        int j10 = j(i10);
        x xVar = (x) this.c.get(i10);
        if (j10 == 1) {
            ((w) n1Var).v.setText(xVar.a.toString());
            return;
        }
        if (j10 != 2) {
            Log.w("RecyclerAdapter", "Cannot bind item to ViewHolder because of wrong view type");
            return;
        }
        z zVar = (z) n1Var;
        c2.b0 b0Var = (c2.b0) xVar.a;
        View view = zVar.v;
        view.setVisibility(0);
        zVar.x.setVisibility(4);
        view.setOnClickListener(new y(zVar, b0Var));
        zVar.y.setText(b0Var.d);
        ImageView imageView = zVar.w;
        a0 a0Var = zVar.z;
        Uri uri = b0Var.f;
        if (uri != null) {
            try {
                createFromStream = Drawable.createFromStream(a0Var.r.n.getContentResolver().openInputStream(uri), null);
            } catch (IOException e10) {
                Log.w("RecyclerAdapter", "Failed to load " + uri, e10);
            }
        }
        int i11 = b0Var.n;
        createFromStream = i11 != 1 ? i11 != 2 ? b0Var.e() ? a0Var.n : a0Var.e : a0Var.h : a0Var.f;
        imageView.setImageDrawable(createFromStream);
    }

    @Override // f2.p0
    public final n1 x(ViewGroup viewGroup, int i10) {
        LayoutInflater layoutInflater = this.d;
        if (i10 != 1) {
            if (i10 == 2) {
                return new z(this, layoutInflater.inflate(R.layout.mr_picker_route_item, viewGroup, false));
            }
            throw new IllegalStateException();
        }
        View inflate = layoutInflater.inflate(R.layout.mr_picker_header_item, viewGroup, false);
        w wVar = new w(inflate);
        wVar.v = (TextView) inflate.findViewById(R.id.mr_picker_header_name);
        return wVar;
    }
}
