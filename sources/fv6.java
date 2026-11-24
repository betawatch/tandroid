// default package

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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class fv6 extends y59 {
    public final ArrayList c = new ArrayList();
    public final LayoutInflater d;
    public final Drawable e;
    public final Drawable f;
    public final Drawable h;
    public final Drawable n;
    public final /* synthetic */ gv6 r;

    public fv6(gv6 gv6Var) {
        this.r = gv6Var;
        Context context = gv6Var.n;
        this.d = LayoutInflater.from(context);
        this.e = yqe.d(context, R.attr.mediaRouteDefaultIconDrawable);
        this.f = yqe.d(context, R.attr.mediaRouteTvIconDrawable);
        this.h = yqe.d(context, R.attr.mediaRouteSpeakerIconDrawable);
        this.n = yqe.d(context, R.attr.mediaRouteSpeakerGroupIconDrawable);
        D();
    }

    public final void D() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        gv6 gv6Var = this.r;
        arrayList.add(new dv6(gv6Var.n.getString(R.string.mr_chooser_title)));
        ArrayList arrayList2 = gv6Var.s;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList.add(new dv6((ew6) obj));
        }
        f();
    }

    @Override // y59
    public final int b() {
        return this.c.size();
    }

    @Override // y59
    public final int d(int i) {
        return ((dv6) this.c.get(i)).b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        if (r1 != null) goto L25;
     */
    @Override // y59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u69 u69Var, int i) {
        Drawable createFromStream;
        int d = d(i);
        dv6 dv6Var = (dv6) this.c.get(i);
        byte b = 1;
        if (d == 1) {
            ((cv6) u69Var).v.setText(dv6Var.a.toString());
            return;
        }
        if (d != 2) {
            Log.w("RecyclerAdapter", "Cannot bind item to ViewHolder because of wrong view type");
            return;
        }
        ev6 ev6Var = (ev6) u69Var;
        ew6 ew6Var = (ew6) dv6Var.a;
        View view = ev6Var.v;
        view.setVisibility(0);
        ev6Var.x.setVisibility(4);
        view.setOnClickListener(new sd3(ev6Var, ew6Var, b));
        ev6Var.y.setText(ew6Var.d);
        ImageView imageView = ev6Var.w;
        fv6 fv6Var = ev6Var.z;
        Uri uri = ew6Var.f;
        if (uri != null) {
            try {
                createFromStream = Drawable.createFromStream(fv6Var.r.n.getContentResolver().openInputStream(uri), null);
            } catch (IOException e) {
                Log.w("RecyclerAdapter", "Failed to load " + uri, e);
            }
        }
        int i2 = ew6Var.n;
        createFromStream = i2 != 1 ? i2 != 2 ? ew6Var.e() ? fv6Var.n : fv6Var.e : fv6Var.h : fv6Var.f;
        imageView.setImageDrawable(createFromStream);
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.d;
        if (i != 1) {
            if (i == 2) {
                return new ev6(this, layoutInflater.inflate(R.layout.mr_picker_route_item, viewGroup, false));
            }
            rjb.h();
            return null;
        }
        View inflate = layoutInflater.inflate(R.layout.mr_picker_header_item, viewGroup, false);
        cv6 cv6Var = new cv6(inflate);
        cv6Var.v = (TextView) inflate.findViewById(R.id.mr_picker_header_name);
        return cv6Var;
    }
}
