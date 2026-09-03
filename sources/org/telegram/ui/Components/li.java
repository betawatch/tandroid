package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class li extends View {
    public final /* synthetic */ int a = 0;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;

    public li(ViewGroup viewGroup, int i10) {
        super(viewGroup.getContext());
        this.c = new ArrayList();
        this.e = new org.telegram.ui.c10(this, 27);
        this.d = viewGroup;
        this.b = i10;
    }

    public void a() {
        org.telegram.ui.c10 c10Var = (org.telegram.ui.c10) this.e;
        ArrayList arrayList = (ArrayList) this.c;
        boolean isEmpty = arrayList.isEmpty();
        int i10 = this.b;
        if (isEmpty && getVisibility() != 8) {
            NotificationCenter.getInstance(i10).removeDelayed(c10Var);
            NotificationCenter.getInstance(i10).doOnIdle(c10Var);
        } else {
            if (arrayList.isEmpty() || getVisibility() == 0) {
                return;
            }
            NotificationCenter.getInstance(i10).removeDelayed(c10Var);
            setVisibility(0);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                lf.b0 b0Var = (lf.b0) this.d;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.c;
                int i10 = this.b;
                b0Var.b(org.telegram.ui.ActionBar.k6.l1(0.5f, org.telegram.ui.ActionBar.k6.v0(i10, g6Var)));
                b0Var.draw(canvas);
                lf.b0 b0Var2 = (lf.b0) this.e;
                b0Var2.b(org.telegram.ui.ActionBar.k6.l1(0.95f, org.telegram.ui.ActionBar.k6.v0(i10, g6Var)));
                b0Var2.draw(canvas);
                break;
            default:
                ArrayList arrayList = (ArrayList) this.c;
                if (!arrayList.isEmpty()) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        ((org.telegram.ui.th0) arrayList.get(i11)).a(canvas);
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
                lf.b0 b0Var = (lf.b0) this.d;
                b0Var.c(AndroidUtilities.dp(12.0f) + i14, 0);
                b0Var.setBounds(0, 0, i10, AndroidUtilities.dp(52.0f) + i14);
                lf.b0 b0Var2 = (lf.b0) this.e;
                b0Var2.c(i14 / 3, 0);
                b0Var2.setBounds(0, 0, i10, i14);
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    public li(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.d = new lf.b0(2);
        this.e = new lf.b0(2);
        this.c = g6Var;
        this.b = i10;
    }
}
