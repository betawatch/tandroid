package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class si extends View {
    public final /* synthetic */ int a = 0;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;

    public si(ViewGroup viewGroup, int i10) {
        super(viewGroup.getContext());
        this.c = new ArrayList();
        this.e = new org.telegram.ui.r00(this, 29);
        this.d = viewGroup;
        this.b = i10;
    }

    public void a() {
        org.telegram.ui.r00 r00Var = (org.telegram.ui.r00) this.e;
        ArrayList arrayList = (ArrayList) this.c;
        boolean isEmpty = arrayList.isEmpty();
        int i10 = this.b;
        if (isEmpty && getVisibility() != 8) {
            NotificationCenter.getInstance(i10).removeDelayed(r00Var);
            NotificationCenter.getInstance(i10).doOnIdle(r00Var);
        } else {
            if (arrayList.isEmpty() || getVisibility() == 0) {
                return;
            }
            NotificationCenter.getInstance(i10).removeDelayed(r00Var);
            setVisibility(0);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                ag.h0 h0Var = (ag.h0) this.d;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.c;
                int i10 = this.b;
                h0Var.b(org.telegram.ui.ActionBar.y6.o1(0.5f, org.telegram.ui.ActionBar.y6.w0(i10, u6Var)));
                h0Var.draw(canvas);
                ag.h0 h0Var2 = (ag.h0) this.e;
                h0Var2.b(org.telegram.ui.ActionBar.y6.o1(0.95f, org.telegram.ui.ActionBar.y6.w0(i10, u6Var)));
                h0Var2.draw(canvas);
                break;
            default:
                ArrayList arrayList = (ArrayList) this.c;
                if (!arrayList.isEmpty()) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        ((org.telegram.ui.ph0) arrayList.get(i11)).a(canvas);
                    }
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                int i14 = AndroidUtilities.statusBarHeight;
                ag.h0 h0Var = (ag.h0) this.d;
                h0Var.c(AndroidUtilities.dp(12.0f) + i14, 0);
                h0Var.setBounds(0, 0, i10, AndroidUtilities.dp(52.0f) + i14);
                ag.h0 h0Var2 = (ag.h0) this.e;
                h0Var2.c(i14 / 3, 0);
                h0Var2.setBounds(0, 0, i10, i14);
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    public si(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.d = new ag.h0(2);
        this.e = new ag.h0(2);
        this.c = u6Var;
        this.b = i10;
    }
}
