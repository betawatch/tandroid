package androidx.mediarouter.app;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.method.LinkMovementMethod;
import android.view.ContextThemeWrapper;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class h extends g.u {
    public LinearLayout E;
    public Button F;
    public ProgressBar G;
    public ListView H;
    public e I;
    public final g J;
    public boolean K;
    public long L;
    public final c M;
    public final p4.x f;
    public final d h;
    public p4.r n;
    public ArrayList r;
    public TextView s;
    public TextView v;
    public RelativeLayout w;
    public TextView x;
    public TextView y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h(Context context) {
        super(r3, r1 == 0 ? v7.d0.e(r3) : r1);
        int i10 = 0;
        ContextThemeWrapper a2 = v7.d0.a(context, false);
        int g10 = v7.d0.g(a2, R.attr.mediaRouteTheme);
        this.n = p4.r.c;
        this.M = new c(this, i10);
        this.f = p4.x.d(getContext());
        this.h = new d(this, i10);
        this.J = new g(this, i10);
    }

    @Override // g.u, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        try {
            getContext().unregisterReceiver(this.J);
        } catch (IllegalArgumentException unused) {
        }
        super.dismiss();
    }

    public final void e(List list) {
        this.L = SystemClock.uptimeMillis();
        this.r.clear();
        this.r.addAll(list);
        this.I.notifyDataSetChanged();
        c cVar = this.M;
        cVar.removeMessages(3);
        cVar.removeMessages(2);
        if (!list.isEmpty()) {
            i(1);
        } else {
            i(0);
            cVar.sendMessageDelayed(cVar.obtainMessage(2), 5000L);
        }
    }

    public final void f() {
        if (this.K) {
            this.f.getClass();
            p4.x.b();
            ArrayList arrayList = new ArrayList(p4.x.c().j);
            int size = arrayList.size();
            while (true) {
                int i10 = size - 1;
                if (size <= 0) {
                    break;
                }
                p4.v vVar = (p4.v) arrayList.get(i10);
                if (vVar.d() || !vVar.g || !vVar.h(this.n)) {
                    arrayList.remove(i10);
                }
                size = i10;
            }
            Collections.sort(arrayList, f.b);
            if (SystemClock.uptimeMillis() - this.L >= 300) {
                e(arrayList);
                return;
            }
            c cVar = this.M;
            cVar.removeMessages(1);
            cVar.sendMessageAtTime(cVar.obtainMessage(1, arrayList), this.L + 300);
        }
    }

    public final void h(p4.r rVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.n.equals(rVar)) {
            return;
        }
        this.n = rVar;
        if (this.K) {
            p4.x xVar = this.f;
            d dVar = this.h;
            xVar.h(dVar);
            xVar.a(rVar, dVar, 1);
        }
        f();
    }

    public final void i(int i10) {
        if (i10 == 0) {
            setTitle(R.string.mr_chooser_title);
            this.H.setVisibility(8);
            this.v.setVisibility(0);
            this.G.setVisibility(0);
            this.E.setVisibility(8);
            this.F.setVisibility(8);
            this.y.setVisibility(8);
            this.w.setVisibility(8);
            return;
        }
        if (i10 == 1) {
            setTitle(R.string.mr_chooser_title);
            this.H.setVisibility(0);
            this.v.setVisibility(8);
            this.G.setVisibility(8);
            this.E.setVisibility(8);
            this.F.setVisibility(8);
            this.y.setVisibility(8);
            this.w.setVisibility(8);
            return;
        }
        if (i10 == 2) {
            setTitle(R.string.mr_chooser_title);
            this.H.setVisibility(8);
            this.v.setVisibility(8);
            this.G.setVisibility(0);
            this.E.setVisibility(8);
            this.F.setVisibility(8);
            this.y.setVisibility(4);
            this.w.setVisibility(0);
            return;
        }
        if (i10 != 3) {
            return;
        }
        setTitle(R.string.mr_chooser_zero_routes_found_title);
        this.H.setVisibility(8);
        this.v.setVisibility(8);
        this.G.setVisibility(8);
        this.E.setVisibility(0);
        this.F.setVisibility(0);
        this.y.setVisibility(0);
        this.w.setVisibility(0);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K = true;
        this.f.a(this.n, this.h, 1);
        f();
        c cVar = this.M;
        cVar.removeMessages(2);
        cVar.removeMessages(3);
        cVar.removeMessages(1);
        cVar.sendMessageDelayed(cVar.obtainMessage(2), 5000L);
    }

    @Override // g.u, androidx.activity.n, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        String string;
        boolean z10;
        super.onCreate(bundle);
        setContentView(R.layout.mr_chooser_dialog);
        this.r = new ArrayList();
        this.I = new e(getContext(), this.r);
        this.s = (TextView) findViewById(R.id.mr_chooser_title);
        this.v = (TextView) findViewById(R.id.mr_chooser_searching);
        this.w = (RelativeLayout) findViewById(R.id.mr_chooser_wifi_warning_container);
        this.x = (TextView) findViewById(R.id.mr_chooser_wifi_warning_description);
        this.y = (TextView) findViewById(R.id.mr_chooser_wifi_learn_more);
        this.E = (LinearLayout) findViewById(R.id.mr_chooser_ok_button_container);
        this.F = (Button) findViewById(R.id.mr_chooser_ok_button);
        this.G = (ProgressBar) findViewById(R.id.mr_chooser_search_progress_bar);
        Context context = getContext();
        boolean z11 = false;
        int i10 = 1;
        if (v7.b0.a == null) {
            if (!v7.b0.c(context)) {
                PackageManager packageManager = context.getPackageManager();
                if (v7.b0.e == null) {
                    v7.b0.e = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
                }
                if (!v7.b0.e.booleanValue() && !v7.b0.a(context) && !v7.b0.d(context)) {
                    z10 = true;
                    v7.b0.a = Boolean.valueOf(z10);
                }
            }
            z10 = false;
            v7.b0.a = Boolean.valueOf(z10);
        }
        if (!v7.b0.a.booleanValue()) {
            if (v7.b0.c == null) {
                SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                if (Build.VERSION.SDK_INT >= 30 && sensorManager != null && sensorManager.getDefaultSensor(36) != null) {
                    z11 = true;
                }
                v7.b0.c = Boolean.valueOf(z11);
            }
            if (!v7.b0.c.booleanValue()) {
                if (v7.b0.c(context) || v7.b0.b(context.getResources())) {
                    string = context.getString(R.string.mr_chooser_wifi_warning_description_tablet);
                } else if (v7.b0.d(context)) {
                    string = context.getString(R.string.mr_chooser_wifi_warning_description_tv);
                } else {
                    PackageManager packageManager2 = context.getPackageManager();
                    if (v7.b0.e == null) {
                        v7.b0.e = Boolean.valueOf(packageManager2.hasSystemFeature("android.hardware.type.watch"));
                    }
                    string = v7.b0.e.booleanValue() ? context.getString(R.string.mr_chooser_wifi_warning_description_watch) : v7.b0.a(context) ? context.getString(R.string.mr_chooser_wifi_warning_description_car) : context.getString(R.string.mr_chooser_wifi_warning_description_unknown);
                }
                this.x.setText(string);
                this.y.setMovementMethod(LinkMovementMethod.getInstance());
                this.F.setOnClickListener(new ah.h0(this, i10));
                ListView listView = (ListView) findViewById(R.id.mr_chooser_list);
                this.H = listView;
                listView.setAdapter((ListAdapter) this.I);
                this.H.setOnItemClickListener(this.I);
                this.H.setEmptyView(findViewById(android.R.id.empty));
                getWindow().setLayout(v7.c0.a(getContext()), -2);
                getContext().registerReceiver(this.J, new IntentFilter("android.intent.action.SCREEN_OFF"));
            }
        }
        string = context.getString(R.string.mr_chooser_wifi_warning_description_phone);
        this.x.setText(string);
        this.y.setMovementMethod(LinkMovementMethod.getInstance());
        this.F.setOnClickListener(new ah.h0(this, i10));
        ListView listView2 = (ListView) findViewById(R.id.mr_chooser_list);
        this.H = listView2;
        listView2.setAdapter((ListAdapter) this.I);
        this.H.setOnItemClickListener(this.I);
        this.H.setEmptyView(findViewById(android.R.id.empty));
        getWindow().setLayout(v7.c0.a(getContext()), -2);
        getContext().registerReceiver(this.J, new IntentFilter("android.intent.action.SCREEN_OFF"));
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.K = false;
        this.f.h(this.h);
        c cVar = this.M;
        cVar.removeMessages(1);
        cVar.removeMessages(2);
        cVar.removeMessages(3);
        super.onDetachedFromWindow();
    }

    @Override // g.u, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.s.setText(charSequence);
    }

    @Override // g.u, android.app.Dialog
    public final void setTitle(int i10) {
        this.s.setText(i10);
    }
}
