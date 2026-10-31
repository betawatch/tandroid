package androidx.mediarouter.app;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ImageButton;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c0 extends g.t {
    public p4.w D;
    public final long E;
    public long F;
    public final android.support.v4.media.session.q G;
    public final p4.y f;
    public final c h;
    public final Context n;
    public p4.s r;
    public ArrayList s;
    public b0 w;
    public RecyclerView x;
    public boolean y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c0(Context context) {
        super(r3, r0 == 0 ? v7.a0.e(r3) : r0);
        ContextThemeWrapper a2 = v7.a0.a(context, false);
        int g10 = v7.a0.g(a2, R.attr.mediaRouteTheme);
        this.r = p4.s.c;
        int i10 = 2;
        this.G = new android.support.v4.media.session.q(this, i10);
        Context context2 = getContext();
        this.f = p4.y.d(context2);
        this.h = new c(this, i10);
        this.n = context2;
        this.E = context2.getResources().getInteger(R.integer.mr_update_routes_delay_ms);
    }

    public final void e() {
        if (this.D == null && this.y) {
            this.f.getClass();
            p4.y.b();
            ArrayList arrayList = new ArrayList(p4.y.c().j);
            int size = arrayList.size();
            while (true) {
                int i10 = size - 1;
                if (size <= 0) {
                    break;
                }
                p4.w wVar = (p4.w) arrayList.get(i10);
                if (wVar.d() || !wVar.g || !wVar.h(this.r)) {
                    arrayList.remove(i10);
                }
                size = i10;
            }
            Collections.sort(arrayList, e.c);
            long uptimeMillis = SystemClock.uptimeMillis() - this.F;
            long j10 = this.E;
            if (uptimeMillis < j10) {
                android.support.v4.media.session.q qVar = this.G;
                qVar.removeMessages(1);
                qVar.sendMessageAtTime(qVar.obtainMessage(1, arrayList), this.F + j10);
            } else {
                this.F = SystemClock.uptimeMillis();
                this.s.clear();
                this.s.addAll(arrayList);
                this.w.D();
            }
        }
    }

    public final void f(p4.s sVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.r.equals(sVar)) {
            return;
        }
        this.r = sVar;
        if (this.y) {
            p4.y yVar = this.f;
            c cVar = this.h;
            yVar.h(cVar);
            yVar.a(sVar, cVar, 1);
        }
        e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y = true;
        this.f.a(this.r, this.h, 1);
        e();
    }

    @Override // g.t, androidx.activity.n, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mr_picker_dialog);
        View decorView = getWindow().getDecorView();
        Context context = this.n;
        decorView.setBackgroundColor(context.getColor(v7.a0.h(context) ? R.color.mr_dynamic_dialog_background_light : R.color.mr_dynamic_dialog_background_dark));
        this.s = new ArrayList();
        ((ImageButton) findViewById(R.id.mr_picker_close_button)).setOnClickListener(new w(this, 0));
        this.w = new b0(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mr_picker_list);
        this.x = recyclerView;
        recyclerView.setAdapter(this.w);
        this.x.setLayoutManager(new s4.a0());
        getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : v7.z.a(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.y = false;
        this.f.h(this.h);
        this.G.removeMessages(1);
    }
}
