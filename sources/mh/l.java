package mh;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.d20;
import org.telegram.messenger.jj;
import org.telegram.ui.Cells.q1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l extends View {
    public final HashMap a;
    public final ArrayList b;
    public final ArrayList c;
    public final int d;

    public l(Activity activity) {
        super(activity);
        this.a = new HashMap();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = d20.s0;
    }

    public static String b(q1 q1Var) {
        jj messageObject = q1Var.getMessageObject();
        if (messageObject == null) {
            return null;
        }
        return messageObject.x0() + "_" + messageObject.f1();
    }

    public final boolean a() {
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            if (!((j) ((Map.Entry) it.next()).getValue()).O) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        if (drawable instanceof j) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        HashMap hashMap = this.a;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((j) ((Map.Entry) it.next()).getValue()).d();
        }
        hashMap.clear();
        this.b.clear();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        HashMap hashMap = this.a;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((j) ((Map.Entry) it.next()).getValue()).draw(canvas);
        }
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            j jVar = (j) hashMap.remove((String) obj);
            if (jVar != null) {
                jVar.d();
            }
        }
        arrayList.clear();
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            ((j) ((Map.Entry) it.next()).getValue()).setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
    }
}
