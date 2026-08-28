package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ji extends View {
    public final /* synthetic */ int a = 0;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;

    public ji(ViewGroup viewGroup, int i9) {
        super(viewGroup.getContext());
        this.c = new ArrayList();
        this.e = new org.telegram.ui.o00(this, 27);
        this.d = viewGroup;
        this.b = i9;
    }

    public void a() {
        org.telegram.ui.o00 o00Var = (org.telegram.ui.o00) this.e;
        ArrayList arrayList = (ArrayList) this.c;
        boolean isEmpty = arrayList.isEmpty();
        int i9 = this.b;
        if (isEmpty && getVisibility() != 8) {
            NotificationCenter.getInstance(i9).removeDelayed(o00Var);
            NotificationCenter.getInstance(i9).doOnIdle(o00Var);
        } else {
            if (arrayList.isEmpty() || getVisibility() == 0) {
                return;
            }
            NotificationCenter.getInstance(i9).removeDelayed(o00Var);
            setVisibility(0);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                ff.c0 c0Var = (ff.c0) this.d;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.c;
                int i9 = this.b;
                c0Var.b(org.telegram.ui.ActionBar.f6.l1(0.5f, org.telegram.ui.ActionBar.f6.v0(i9, b6Var)));
                c0Var.draw(canvas);
                ff.c0 c0Var2 = (ff.c0) this.e;
                c0Var2.b(org.telegram.ui.ActionBar.f6.l1(0.95f, org.telegram.ui.ActionBar.f6.v0(i9, b6Var)));
                c0Var2.draw(canvas);
                break;
            default:
                ArrayList arrayList = (ArrayList) this.c;
                if (!arrayList.isEmpty()) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        ((org.telegram.ui.lh0) arrayList.get(i10)).a(canvas);
                    }
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                super.onSizeChanged(i9, i10, i11, i12);
                int i13 = AndroidUtilities.statusBarHeight;
                ff.c0 c0Var = (ff.c0) this.d;
                c0Var.c(AndroidUtilities.dp(12.0f) + i13, 0);
                c0Var.setBounds(0, 0, i9, AndroidUtilities.dp(52.0f) + i13);
                ff.c0 c0Var2 = (ff.c0) this.e;
                c0Var2.c(i13 / 3, 0);
                c0Var2.setBounds(0, 0, i9, i13);
                break;
            default:
                super.onSizeChanged(i9, i10, i11, i12);
                break;
        }
    }

    public ji(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.d = new ff.c0(2);
        this.e = new ff.c0(2);
        this.c = b6Var;
        this.b = i9;
    }
}
