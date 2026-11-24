// default package

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class g81 extends ogc {
    public m8 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ sy4 c;
    public final /* synthetic */ d d;
    public final /* synthetic */ fja e;
    public final /* synthetic */ w81 f;

    public g81(w81 w81Var, Context context, sy4 sy4Var, d dVar, fja fjaVar) {
        this.f = w81Var;
        this.b = context;
        this.c = sy4Var;
        this.d = dVar;
        this.e = fjaVar;
    }

    @Override // ogc
    public final void b(View view, int i, int i2) {
        w81 w81Var = this.f;
        r59 a = w81Var.a(view);
        ArrayList arrayList = w81Var.f;
        a.setAdapter(((u81) arrayList.get(i)).c);
        if (((u81) arrayList.get(i)).b == 1 || ((u81) arrayList.get(i)).b == 4) {
            view.getContext();
            a.setLayoutManager(new q55(3));
        } else {
            view.getContext();
            a.setLayoutManager(new u46());
        }
        a.setTag(Integer.valueOf(((u81) arrayList.get(i)).b));
        view.setTag(Integer.valueOf(((u81) arrayList.get(i)).b));
        if (this.e != null) {
            ((v59) w81Var.n).L(view);
        }
    }

    @Override // ogc
    public final View d(int i) {
        Context context = this.b;
        r59 r59Var = new r59(context, null);
        sy4 sy4Var = this.c;
        if (sy4Var != null) {
            sy4Var.b(r59Var);
        }
        sc3 sc3Var = (sc3) r59Var.getItemAnimator();
        sc3Var.C = false;
        sc3Var.m = false;
        r59Var.setClipToPadding(false);
        if (i != 1 && i != 4 && sy4Var != null) {
            r59Var.setSections(false);
        }
        r59Var.setCaptureSectionsDecoratorAllowed(true);
        w81 w81Var = this.f;
        if (i == 1) {
            r59Var.setPadding(gm.L(2.0f), 0, 0, w81Var.w);
        } else {
            r59Var.setPadding(0, 0, 0, w81Var.w);
        }
        r59Var.setOnItemClickListener(new f81(this, r59Var));
        r59Var.setOnItemLongClickListener(new jf((Object) this, (Object) r59Var, (Object) this.d, (byte) 9));
        return this.e == null ? r59Var : new v81(r59Var, context);
    }

    @Override // ogc
    public final int e() {
        return this.f.f.size();
    }

    @Override // ogc
    public final int f(int i) {
        return ((u81) this.f.f.get(i)).b;
    }

    @Override // ogc
    public final CharSequence g(int i) {
        return ((u81) this.f.f.get(i)).a;
    }

    @Override // ogc
    public final int h(int i) {
        return ((u81) this.f.f.get(i)).b;
    }
}
