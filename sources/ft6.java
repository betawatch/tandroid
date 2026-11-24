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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ft6 extends w39 {
    public final ArrayList c = new ArrayList();
    public final LayoutInflater d;
    public final Drawable e;
    public final Drawable f;
    public final Drawable h;
    public final Drawable n;
    public final /* synthetic */ gt6 r;

    public ft6(gt6 gt6Var) {
        this.r = gt6Var;
        Context context = gt6Var.n;
        this.d = LayoutInflater.from(context);
        this.e = voe.d(context, R.attr.mediaRouteDefaultIconDrawable);
        this.f = voe.d(context, R.attr.mediaRouteTvIconDrawable);
        this.h = voe.d(context, R.attr.mediaRouteSpeakerIconDrawable);
        this.n = voe.d(context, R.attr.mediaRouteSpeakerGroupIconDrawable);
        D();
    }

    public final void D() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        gt6 gt6Var = this.r;
        arrayList.add(new dt6(gt6Var.n.getString(R.string.mr_chooser_title)));
        ArrayList arrayList2 = gt6Var.s;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList.add(new dt6((eu6) obj));
        }
        f();
    }

    @Override // w39
    public final int b() {
        return this.c.size();
    }

    @Override // w39
    public final int d(int i) {
        return ((dt6) this.c.get(i)).b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        if (r1 != null) goto L25;
     */
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s49 s49Var, int i) {
        Drawable createFromStream;
        int d = d(i);
        dt6 dt6Var = (dt6) this.c.get(i);
        byte b = 1;
        if (d == 1) {
            ((ct6) s49Var).v.setText(dt6Var.a.toString());
            return;
        }
        if (d != 2) {
            Log.w("RecyclerAdapter", "Cannot bind item to ViewHolder because of wrong view type");
            return;
        }
        et6 et6Var = (et6) s49Var;
        eu6 eu6Var = (eu6) dt6Var.a;
        View view = et6Var.v;
        view.setVisibility(0);
        et6Var.x.setVisibility(4);
        view.setOnClickListener(new fc3(et6Var, eu6Var, b));
        et6Var.y.setText(eu6Var.d);
        ImageView imageView = et6Var.w;
        ft6 ft6Var = et6Var.z;
        Uri uri = eu6Var.f;
        if (uri != null) {
            try {
                createFromStream = Drawable.createFromStream(ft6Var.r.n.getContentResolver().openInputStream(uri), null);
            } catch (IOException e) {
                Log.w("RecyclerAdapter", "Failed to load " + uri, e);
            }
        }
        int i2 = eu6Var.n;
        createFromStream = i2 != 1 ? i2 != 2 ? eu6Var.e() ? ft6Var.n : ft6Var.e : ft6Var.h : ft6Var.f;
        imageView.setImageDrawable(createFromStream);
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.d;
        if (i != 1) {
            if (i == 2) {
                return new et6(this, layoutInflater.inflate(R.layout.mr_picker_route_item, viewGroup, false));
            }
            sdb.a();
            return null;
        }
        View inflate = layoutInflater.inflate(R.layout.mr_picker_header_item, viewGroup, false);
        ct6 ct6Var = new ct6(inflate);
        ct6Var.v = (TextView) inflate.findViewById(R.id.mr_picker_header_name);
        return ct6Var;
    }
}
