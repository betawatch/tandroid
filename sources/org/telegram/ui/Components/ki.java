package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ki extends View {
    public final /* synthetic */ int a = 0;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;

    public ki(ViewGroup viewGroup, int i10) {
        super(viewGroup.getContext());
        this.c = new ArrayList();
        this.e = new org.telegram.ui.d10(this, 27);
        this.d = viewGroup;
        this.b = i10;
    }

    public void a() {
        org.telegram.ui.d10 d10Var = (org.telegram.ui.d10) this.e;
        ArrayList arrayList = (ArrayList) this.c;
        boolean isEmpty = arrayList.isEmpty();
        int i10 = this.b;
        if (isEmpty && getVisibility() != 8) {
            NotificationCenter.getInstance(i10).removeDelayed(d10Var);
            NotificationCenter.getInstance(i10).doOnIdle(d10Var);
        } else {
            if (arrayList.isEmpty() || getVisibility() == 0) {
                return;
            }
            NotificationCenter.getInstance(i10).removeDelayed(d10Var);
            setVisibility(0);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                kf.b0 b0Var = (kf.b0) this.d;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.c;
                int i10 = this.b;
                b0Var.b(org.telegram.ui.ActionBar.j6.l1(0.5f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
                b0Var.draw(canvas);
                kf.b0 b0Var2 = (kf.b0) this.e;
                b0Var2.b(org.telegram.ui.ActionBar.j6.l1(0.95f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
                b0Var2.draw(canvas);
                break;
            default:
                ArrayList arrayList = (ArrayList) this.c;
                if (!arrayList.isEmpty()) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        ((org.telegram.ui.uh0) arrayList.get(i11)).a(canvas);
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
                kf.b0 b0Var = (kf.b0) this.d;
                b0Var.c(AndroidUtilities.dp(12.0f) + i14, 0);
                b0Var.setBounds(0, 0, i10, AndroidUtilities.dp(52.0f) + i14);
                kf.b0 b0Var2 = (kf.b0) this.e;
                b0Var2.c(i14 / 3, 0);
                b0Var2.setBounds(0, 0, i10, i14);
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    public ki(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.d = new kf.b0(2);
        this.e = new kf.b0(2);
        this.c = f6Var;
        this.b = i10;
    }
}
