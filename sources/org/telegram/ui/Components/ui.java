package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ui extends View {
    public final /* synthetic */ int a = 0;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;

    public ui(ViewGroup viewGroup, int i10) {
        super(viewGroup.getContext());
        this.c = new ArrayList();
        this.e = new org.telegram.ui.g10(this, 27);
        this.d = viewGroup;
        this.b = i10;
    }

    public void a() {
        org.telegram.ui.g10 g10Var = (org.telegram.ui.g10) this.e;
        ArrayList arrayList = (ArrayList) this.c;
        boolean isEmpty = arrayList.isEmpty();
        int i10 = this.b;
        if (isEmpty && getVisibility() != 8) {
            NotificationCenter.getInstance(i10).removeDelayed(g10Var);
            NotificationCenter.getInstance(i10).doOnIdle(g10Var);
        } else {
            if (arrayList.isEmpty() || getVisibility() == 0) {
                return;
            }
            NotificationCenter.getInstance(i10).removeDelayed(g10Var);
            setVisibility(0);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                yf.y yVar = (yf.y) this.d;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.c;
                int i10 = this.b;
                yVar.b(org.telegram.ui.ActionBar.j6.l1(0.5f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
                yVar.draw(canvas);
                yf.y yVar2 = (yf.y) this.e;
                yVar2.b(org.telegram.ui.ActionBar.j6.l1(0.95f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
                yVar2.draw(canvas);
                break;
            default:
                ArrayList arrayList = (ArrayList) this.c;
                if (!arrayList.isEmpty()) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        ((org.telegram.ui.di0) arrayList.get(i11)).a(canvas);
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
                yf.y yVar = (yf.y) this.d;
                yVar.c(AndroidUtilities.dp(12.0f) + i14, 0);
                yVar.setBounds(0, 0, i10, AndroidUtilities.dp(52.0f) + i14);
                yf.y yVar2 = (yf.y) this.e;
                yVar2.c(i14 / 3, 0);
                yVar2.setBounds(0, 0, i10, i14);
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    public ui(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.d = new yf.y(2);
        this.e = new yf.y(2);
        this.c = f6Var;
        this.b = i10;
    }
}
