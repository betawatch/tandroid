package m;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.text.TextPaint;
import android.util.SparseArray;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.x5;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicMarkableReference;
import org.telegram.messenger.ha;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class q3 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map] */
    public q3(Set set, a0.f fVar, String str, String str2, q8.a aVar) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.a = unmodifiableSet;
        a0.f fVar2 = fVar == null ? Collections.EMPTY_MAP : fVar;
        this.c = fVar2;
        this.d = str;
        this.e = str2;
        this.f = aVar == null ? q8.a.a : aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = fVar2.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.b = DesugarCollections.unmodifiableSet(hashSet);
    }

    public static void a(FrameLayout frameLayout) {
        n6.d dVar = n6.d.e;
        Context context = frameLayout.getContext();
        int d = dVar.d(context, n6.e.a);
        String b10 = q6.s.b(context, d);
        String c10 = q6.s.c(context, d);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(b10);
        linearLayout.addView(textView);
        Intent b11 = dVar.b(d, context, null);
        if (b11 != null) {
            Button button = new Button(context);
            button.setId(R.id.button1);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(c10);
            linearLayout.addView(button);
            button.setOnClickListener(new a7.d(context, b11));
        }
    }

    public void b(a7.c cVar) {
        if (((h6.m) this.b) != null) {
            cVar.b();
            return;
        }
        if (((LinkedList) this.c) == null) {
            this.c = new LinkedList();
        }
        ((LinkedList) this.c).add(cVar);
        cb.c cVar2 = (cb.c) this.d;
        this.f = cVar2;
        ArrayList arrayList = (ArrayList) this.g;
        Context context = (Context) this.a;
        if (cVar2 == null || ((h6.m) this.b) != null) {
            return;
        }
        try {
            synchronized (k8.b.class) {
                k8.b.a(context);
            }
            l8.f Y0 = c8.d1.a(context).Y0(new a7.b(context));
            if (Y0 == null) {
                return;
            }
            ((cb.c) this.f).v(new h6.m((x5) this.e, Y0));
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((h6.m) this.b).t((ha) obj);
            }
            arrayList.clear();
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        } catch (n6.f unused) {
        }
    }

    public q3(String str, ga.d dVar, ba.e eVar) {
        this.d = new ab.q(this, false);
        this.e = new ab.q(this, true);
        this.f = new f5.u(3, (short) 0);
        this.g = new AtomicMarkableReference(null, false);
        this.c = str;
        this.a = new ca.h(dVar);
        this.b = eVar;
    }

    public q3(Context context, f6 f6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        Paint paint = new Paint();
        this.b = paint;
        this.e = new Paint();
        this.f = new SparseArray();
        this.g = new HashMap();
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setColor(-1);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        Drawable mutate = context.getDrawable(org.telegram.messenger.beta.R.drawable.play_mini_video).mutate();
        this.c = mutate;
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        Drawable mutate2 = context.getDrawable(org.telegram.messenger.beta.R.drawable.filled_views).mutate();
        this.d = mutate2;
        mutate2.setBounds(0, 0, (int) (mutate2.getIntrinsicWidth() * 0.7f), (int) (mutate2.getIntrinsicHeight() * 0.7f));
        paint.setColor(k6.w0(k6.zi, f6Var));
    }
}
