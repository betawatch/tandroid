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
import b8.nd;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicMarkableReference;
import org.telegram.messenger.ba;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class o3 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map] */
    public o3(Set set, a0.f fVar, String str, String str2, p8.a aVar) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.a = unmodifiableSet;
        a0.f fVar2 = fVar == null ? Collections.EMPTY_MAP : fVar;
        this.c = fVar2;
        this.d = str;
        this.e = str2;
        this.f = aVar == null ? p8.a.a : aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = fVar2.values().iterator();
        if (it.hasNext()) {
            throw a1.g.m(it);
        }
        this.b = DesugarCollections.unmodifiableSet(hashSet);
    }

    public static void a(FrameLayout frameLayout) {
        m6.d dVar = m6.d.e;
        Context context = frameLayout.getContext();
        int d = dVar.d(context, m6.e.a);
        String b10 = p6.s.b(context, d);
        String c2 = p6.s.c(context, d);
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
            button.setText(c2);
            linearLayout.addView(button);
            button.setOnClickListener(new androidx.mediarouter.app.z(context, b11));
        }
    }

    public void b(z6.d dVar) {
        if (((android.support.v4.media.session.a0) this.b) != null) {
            dVar.b();
            return;
        }
        if (((LinkedList) this.c) == null) {
            this.c = new LinkedList();
        }
        ((LinkedList) this.c).add(dVar);
        z6.c cVar = (z6.c) this.d;
        this.f = cVar;
        ArrayList arrayList = (ArrayList) this.g;
        Context context = (Context) this.a;
        if (cVar == null || ((android.support.v4.media.session.a0) this.b) != null) {
            return;
        }
        try {
            synchronized (j8.a.class) {
                j8.a.a(context);
            }
            k8.f Y0 = nd.a(context).Y0(new z6.b(context));
            if (Y0 == null) {
                return;
            }
            ((z6.c) this.f).a(new android.support.v4.media.session.a0((ai.c0) this.e, Y0));
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                ((android.support.v4.media.session.a0) this.b).k((ba) obj);
            }
            arrayList.clear();
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        } catch (m6.f unused) {
        }
    }

    public o3(String str, fa.f fVar, aa.g gVar) {
        this.d = new b4.n(this, false);
        this.e = new b4.n(this, true);
        this.f = new e5.u(2, (short) 0);
        this.g = new AtomicMarkableReference(null, false);
        this.c = str;
        this.a = new ba.h(fVar);
        this.b = gVar;
    }

    public o3(Context context, e6 e6Var) {
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
        paint.setColor(k6.w0(k6.zi, e6Var));
    }
}
