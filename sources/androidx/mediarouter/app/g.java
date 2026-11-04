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
import b8.b1;
import b8.c1;
import b8.d1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g extends g.u {
    public TextView E;
    public LinearLayout F;
    public Button G;
    public ProgressBar H;
    public ListView I;
    public d J;
    public final f K;
    public boolean L;
    public long M;
    public final android.support.v4.media.session.q N;
    public final r4.y f;
    public final c h;
    public r4.r n;
    public ArrayList r;
    public TextView s;
    public TextView w;
    public RelativeLayout x;
    public TextView y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(Context context) {
        super(r3, r1 == 0 ? d1.e(r3) : r1);
        int i3 = 0;
        ContextThemeWrapper a10 = d1.a(context, false);
        int g7 = d1.g(a10, R.attr.mediaRouteTheme);
        this.n = r4.r.c;
        this.N = new android.support.v4.media.session.q(this, 1);
        this.f = r4.y.d(getContext());
        this.h = new c(this, i3);
        this.K = new f(this, i3);
    }

    @Override // g.u, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        try {
            getContext().unregisterReceiver(this.K);
        } catch (IllegalArgumentException unused) {
        }
        super.dismiss();
    }

    public final void e(List list) {
        this.M = SystemClock.uptimeMillis();
        this.r.clear();
        this.r.addAll(list);
        this.J.notifyDataSetChanged();
        android.support.v4.media.session.q qVar = this.N;
        qVar.removeMessages(3);
        qVar.removeMessages(2);
        if (!list.isEmpty()) {
            i(1);
        } else {
            i(0);
            qVar.sendMessageDelayed(qVar.obtainMessage(2), 5000L);
        }
    }

    public final void f() {
        if (this.L) {
            this.f.getClass();
            r4.y.b();
            ArrayList arrayList = new ArrayList(r4.y.c().j);
            int size = arrayList.size();
            while (true) {
                int i3 = size - 1;
                if (size <= 0) {
                    break;
                }
                r4.w wVar = (r4.w) arrayList.get(i3);
                if (wVar.d() || !wVar.g || !wVar.h(this.n)) {
                    arrayList.remove(i3);
                }
                size = i3;
            }
            Collections.sort(arrayList, e.b);
            if (SystemClock.uptimeMillis() - this.M >= 300) {
                e(arrayList);
                return;
            }
            android.support.v4.media.session.q qVar = this.N;
            qVar.removeMessages(1);
            qVar.sendMessageAtTime(qVar.obtainMessage(1, arrayList), this.M + 300);
        }
    }

    public final void h(r4.r rVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.n.equals(rVar)) {
            return;
        }
        this.n = rVar;
        if (this.L) {
            r4.y yVar = this.f;
            c cVar = this.h;
            yVar.h(cVar);
            yVar.a(rVar, cVar, 1);
        }
        f();
    }

    public final void i(int i3) {
        if (i3 == 0) {
            setTitle(R.string.mr_chooser_title);
            this.I.setVisibility(8);
            this.w.setVisibility(0);
            this.H.setVisibility(0);
            this.F.setVisibility(8);
            this.G.setVisibility(8);
            this.E.setVisibility(8);
            this.x.setVisibility(8);
            return;
        }
        if (i3 == 1) {
            setTitle(R.string.mr_chooser_title);
            this.I.setVisibility(0);
            this.w.setVisibility(8);
            this.H.setVisibility(8);
            this.F.setVisibility(8);
            this.G.setVisibility(8);
            this.E.setVisibility(8);
            this.x.setVisibility(8);
            return;
        }
        if (i3 == 2) {
            setTitle(R.string.mr_chooser_title);
            this.I.setVisibility(8);
            this.w.setVisibility(8);
            this.H.setVisibility(0);
            this.F.setVisibility(8);
            this.G.setVisibility(8);
            this.E.setVisibility(4);
            this.x.setVisibility(0);
            return;
        }
        if (i3 != 3) {
            return;
        }
        setTitle(R.string.mr_chooser_zero_routes_found_title);
        this.I.setVisibility(8);
        this.w.setVisibility(8);
        this.H.setVisibility(8);
        this.F.setVisibility(0);
        this.G.setVisibility(0);
        this.E.setVisibility(0);
        this.x.setVisibility(0);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.L = true;
        this.f.a(this.n, this.h, 1);
        f();
        android.support.v4.media.session.q qVar = this.N;
        qVar.removeMessages(2);
        qVar.removeMessages(3);
        qVar.removeMessages(1);
        qVar.sendMessageDelayed(qVar.obtainMessage(2), 5000L);
    }

    @Override // g.u, androidx.activity.m, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        String string;
        boolean z10;
        super.onCreate(bundle);
        setContentView(R.layout.mr_chooser_dialog);
        this.r = new ArrayList();
        this.J = new d(getContext(), this.r);
        this.s = (TextView) findViewById(R.id.mr_chooser_title);
        this.w = (TextView) findViewById(R.id.mr_chooser_searching);
        this.x = (RelativeLayout) findViewById(R.id.mr_chooser_wifi_warning_container);
        this.y = (TextView) findViewById(R.id.mr_chooser_wifi_warning_description);
        this.E = (TextView) findViewById(R.id.mr_chooser_wifi_learn_more);
        this.F = (LinearLayout) findViewById(R.id.mr_chooser_ok_button_container);
        this.G = (Button) findViewById(R.id.mr_chooser_ok_button);
        this.H = (ProgressBar) findViewById(R.id.mr_chooser_search_progress_bar);
        Context context = getContext();
        boolean z11 = false;
        if (b1.a == null) {
            if (!b1.c(context)) {
                PackageManager packageManager = context.getPackageManager();
                if (b1.e == null) {
                    b1.e = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
                }
                if (!b1.e.booleanValue() && !b1.a(context) && !b1.d(context)) {
                    z10 = true;
                    b1.a = Boolean.valueOf(z10);
                }
            }
            z10 = false;
            b1.a = Boolean.valueOf(z10);
        }
        if (!b1.a.booleanValue()) {
            if (b1.c == null) {
                SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                if (Build.VERSION.SDK_INT >= 30 && sensorManager != null && sensorManager.getDefaultSensor(36) != null) {
                    z11 = true;
                }
                b1.c = Boolean.valueOf(z11);
            }
            if (!b1.c.booleanValue()) {
                if (b1.c(context) || b1.b(context.getResources())) {
                    string = context.getString(R.string.mr_chooser_wifi_warning_description_tablet);
                } else if (b1.d(context)) {
                    string = context.getString(R.string.mr_chooser_wifi_warning_description_tv);
                } else {
                    PackageManager packageManager2 = context.getPackageManager();
                    if (b1.e == null) {
                        b1.e = Boolean.valueOf(packageManager2.hasSystemFeature("android.hardware.type.watch"));
                    }
                    string = b1.e.booleanValue() ? context.getString(R.string.mr_chooser_wifi_warning_description_watch) : b1.a(context) ? context.getString(R.string.mr_chooser_wifi_warning_description_car) : context.getString(R.string.mr_chooser_wifi_warning_description_unknown);
                }
                this.y.setText(string);
                this.E.setMovementMethod(LinkMovementMethod.getInstance());
                this.G.setOnClickListener(new ai.b(this, 3));
                ListView listView = (ListView) findViewById(R.id.mr_chooser_list);
                this.I = listView;
                listView.setAdapter((ListAdapter) this.J);
                this.I.setOnItemClickListener(this.J);
                this.I.setEmptyView(findViewById(android.R.id.empty));
                getWindow().setLayout(c1.a(getContext()), -2);
                getContext().registerReceiver(this.K, new IntentFilter("android.intent.action.SCREEN_OFF"));
            }
        }
        string = context.getString(R.string.mr_chooser_wifi_warning_description_phone);
        this.y.setText(string);
        this.E.setMovementMethod(LinkMovementMethod.getInstance());
        this.G.setOnClickListener(new ai.b(this, 3));
        ListView listView2 = (ListView) findViewById(R.id.mr_chooser_list);
        this.I = listView2;
        listView2.setAdapter((ListAdapter) this.J);
        this.I.setOnItemClickListener(this.J);
        this.I.setEmptyView(findViewById(android.R.id.empty));
        getWindow().setLayout(c1.a(getContext()), -2);
        getContext().registerReceiver(this.K, new IntentFilter("android.intent.action.SCREEN_OFF"));
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.L = false;
        this.f.h(this.h);
        android.support.v4.media.session.q qVar = this.N;
        qVar.removeMessages(1);
        qVar.removeMessages(2);
        qVar.removeMessages(3);
        super.onDetachedFromWindow();
    }

    @Override // g.u, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.s.setText(charSequence);
    }

    @Override // g.u, android.app.Dialog
    public final void setTitle(int i3) {
        this.s.setText(i3);
    }
}
