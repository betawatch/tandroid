package i8;

import a8.dd;
import a8.h0;
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
import li.e3;
import o6.q;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class j {
    public h0 a;
    public Bundle b;
    public LinkedList c;
    public final d e;
    public final Context f;
    public e3 g;
    public final e3 d = new e3(this, 25);
    public final ArrayList h = new ArrayList();

    public j(d dVar, Context context) {
        this.e = dVar;
        this.f = context;
    }

    public static void a(d dVar) {
        l6.d dVar2 = l6.d.d;
        Context context = dVar.getContext();
        int d = dVar2.d(context, l6.e.a);
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
        while (!this.c.isEmpty() && ((y6.e) this.c.getLast()).a() >= i10) {
            this.c.removeLast();
        }
    }

    public final void c(Bundle bundle, y6.e eVar) {
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
                    e.c(context);
                }
                j8.g W0 = dd.a(context).W0(new y6.b(context));
                if (W0 == null) {
                    return;
                }
                this.g.x0(new h0(this.e, W0));
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    this.a.p((f) obj);
                }
                arrayList.clear();
            } catch (RemoteException e) {
                throw new androidx.car.app.j(e);
            } catch (l6.f unused) {
            }
        }
    }
}
