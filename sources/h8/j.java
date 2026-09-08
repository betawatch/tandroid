package h8;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.mediarouter.app.a0;
import java.util.ArrayList;
import java.util.LinkedList;
import ji.u4;
import n6.q;
import v7.j8;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class j {
    public aa.a a;
    public Bundle b;
    public LinkedList c;
    public final d e;
    public final Context f;
    public u4 g;
    public final u4 d = new u4(this, 28);
    public final ArrayList h = new ArrayList();

    public j(d dVar, Context context) {
        this.e = dVar;
        this.f = context;
    }

    public static void a(d dVar) {
        k6.d dVar2 = k6.d.d;
        Context context = dVar.getContext();
        int d = dVar2.d(context, k6.e.a);
        String c10 = q.c(context, d);
        String b10 = q.b(context, d);
        LinearLayout linearLayout = new LinearLayout(dVar.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        dVar.addView(linearLayout);
        TextView textView = new TextView(dVar.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(c10);
        linearLayout.addView(textView);
        Intent b11 = dVar2.b(context, null, d);
        if (b11 != null) {
            Button button = new Button(context);
            button.setId(R.id.button1);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(b10);
            linearLayout.addView(button);
            button.setOnClickListener(new a0(context, b11));
        }
    }

    public final void b(int i10) {
        while (!this.c.isEmpty() && ((x6.e) this.c.getLast()).a() >= i10) {
            this.c.removeLast();
        }
    }

    public final void c(Bundle bundle, x6.e eVar) {
        if (this.a != null) {
            eVar.b();
            return;
        }
        if (this.c == null) {
            this.c = new LinkedList();
        }
        this.c.add(eVar);
        if (bundle != null) {
            Bundle bundle2 = this.b;
            if (bundle2 == null) {
                this.b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        this.g = this.d;
        ArrayList arrayList = this.h;
        Context context = this.f;
        if (this.a == null) {
            try {
                synchronized (e.class) {
                    e.b(context);
                }
                i8.g X0 = j8.a(context).X0(new x6.b(context));
                if (X0 == null) {
                    return;
                }
                this.g.C(new aa.a(this.e, X0));
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    this.a.u((f) obj);
                }
                arrayList.clear();
            } catch (RemoteException e7) {
                throw new androidx.car.app.j(e7);
            } catch (k6.f unused) {
            }
        }
    }
}
