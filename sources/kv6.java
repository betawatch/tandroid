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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class kv6 extends j79 {
    public final ArrayList c = new ArrayList();
    public final LayoutInflater d;
    public final Drawable e;
    public final Drawable f;
    public final Drawable h;
    public final Drawable n;
    public final /* synthetic */ lv6 r;

    public kv6(lv6 lv6Var) {
        this.r = lv6Var;
        Context context = lv6Var.n;
        this.d = LayoutInflater.from(context);
        this.e = nte.d(context, R.attr.mediaRouteDefaultIconDrawable);
        this.f = nte.d(context, R.attr.mediaRouteTvIconDrawable);
        this.h = nte.d(context, R.attr.mediaRouteSpeakerIconDrawable);
        this.n = nte.d(context, R.attr.mediaRouteSpeakerGroupIconDrawable);
        D();
    }

    public final void D() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        lv6 lv6Var = this.r;
        arrayList.add(new iv6(lv6Var.n.getString(R.string.mr_chooser_title)));
        ArrayList arrayList2 = lv6Var.s;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList.add(new iv6((jw6) obj));
        }
        f();
    }

    @Override // j79
    public final int b() {
        return this.c.size();
    }

    @Override // j79
    public final int d(int i) {
        return ((iv6) this.c.get(i)).b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        if (r1 != null) goto L25;
     */
    @Override // j79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(f89 f89Var, int i) {
        Drawable createFromStream;
        int d = d(i);
        iv6 iv6Var = (iv6) this.c.get(i);
        byte b = 1;
        if (d == 1) {
            ((hv6) f89Var).v.setText(iv6Var.a.toString());
            return;
        }
        if (d != 2) {
            Log.w("RecyclerAdapter", "Cannot bind item to ViewHolder because of wrong view type");
            return;
        }
        jv6 jv6Var = (jv6) f89Var;
        jw6 jw6Var = (jw6) iv6Var.a;
        View view = jv6Var.v;
        view.setVisibility(0);
        jv6Var.x.setVisibility(4);
        view.setOnClickListener(new yc3(jv6Var, jw6Var, b));
        jv6Var.y.setText(jw6Var.d);
        ImageView imageView = jv6Var.w;
        kv6 kv6Var = jv6Var.z;
        Uri uri = jw6Var.f;
        if (uri != null) {
            try {
                createFromStream = Drawable.createFromStream(kv6Var.r.n.getContentResolver().openInputStream(uri), null);
            } catch (IOException e) {
                Log.w("RecyclerAdapter", "Failed to load " + uri, e);
            }
        }
        int i2 = jw6Var.n;
        createFromStream = i2 != 1 ? i2 != 2 ? jw6Var.e() ? kv6Var.n : kv6Var.e : kv6Var.h : kv6Var.f;
        imageView.setImageDrawable(createFromStream);
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.d;
        if (i != 1) {
            if (i == 2) {
                return new jv6(this, layoutInflater.inflate(R.layout.mr_picker_route_item, viewGroup, false));
            }
            grb.g();
            return null;
        }
        View inflate = layoutInflater.inflate(R.layout.mr_picker_header_item, viewGroup, false);
        hv6 hv6Var = new hv6(inflate);
        hv6Var.v = (TextView) inflate.findViewById(R.id.mr_picker_header_name);
        return hv6Var;
    }
}
