package ch;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Cells.t1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class k extends View {
    public final HashMap a;
    public final ArrayList b;
    public final ArrayList c;
    public final int d;

    public k(Activity activity) {
        super(activity);
        this.a = new HashMap();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = UserConfig.selectedAccount;
    }

    public static String b(t1 t1Var) {
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject == null) {
            return null;
        }
        return messageObject.getChatId() + "_" + messageObject.getId();
    }

    public final boolean a() {
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            if (!((j) ((Map.Entry) it.next()).getValue()).K) {
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
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            j jVar = (j) hashMap.remove((String) obj);
            if (jVar != null) {
                jVar.d();
            }
        }
        arrayList.clear();
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            ((j) ((Map.Entry) it.next()).getValue()).setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
    }
}
