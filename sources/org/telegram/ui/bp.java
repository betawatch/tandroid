package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class bp extends org.telegram.ui.Components.nm0 {
    public static final /* synthetic */ int j3 = 0;
    public final ap f3;
    public boolean g3;
    public final Paint h3;
    public final /* synthetic */ cp i3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp(cp cpVar, Context context) {
        super(context, null);
        this.i3 = cpVar;
        this.g3 = false;
        this.h3 = new Paint(1);
        ap apVar = new ap(this);
        this.f3 = apVar;
        setAdapter(apVar);
        setLayoutManager(new s4.c0());
        setOnItemClickListener(new zo(this));
        new s4.z(new ei.f(this, 1)).h(this);
    }

    public final void C1(TLRPC.TL_username tL_username, boolean z10, boolean z11) {
        TLRPC.TL_username tL_username2;
        int min;
        cp cpVar = this.i3;
        ArrayList arrayList = cpVar.N;
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (arrayList.get(i11) == tL_username) {
                int i12 = i11 + 1;
                if (i11 < 0 || i11 >= arrayList.size() || (tL_username2 = (TLRPC.TL_username) arrayList.get(i11)) == null) {
                    return;
                }
                int i13 = -1;
                if (tL_username2.active != z10) {
                    tL_username2.active = z10;
                    if (z10) {
                        int i14 = 0;
                        while (true) {
                            if (i14 >= arrayList.size()) {
                                i14 = -1;
                                break;
                            } else if (!((TLRPC.TL_username) arrayList.get(i14)).active) {
                                break;
                            } else {
                                i14++;
                            }
                        }
                        if (i14 >= 0) {
                            min = Math.max(0, i14 - 1);
                            i13 = min + 1;
                        }
                    } else {
                        int i15 = -1;
                        for (int i16 = 0; i16 < arrayList.size(); i16++) {
                            if (((TLRPC.TL_username) arrayList.get(i16)).active) {
                                i15 = i16;
                            }
                        }
                        if (i15 >= 0) {
                            min = Math.min(arrayList.size() - 1, i15 + 1);
                            i13 = min + 1;
                        }
                    }
                }
                int i17 = 0;
                while (true) {
                    if (i17 >= getChildCount()) {
                        break;
                    }
                    View childAt = getChildAt(i17);
                    if (RecyclerView.R(childAt) == i12) {
                        if (z11) {
                            AndroidUtilities.shakeView(childAt);
                        }
                        if (childAt instanceof qa) {
                            qa qaVar = (qa) childAt;
                            qaVar.setLoading(cpVar.P.contains(tL_username2.username));
                            TLRPC.TL_username tL_username3 = qaVar.v;
                            if (tL_username3 != null) {
                                qaVar.a(tL_username3, qaVar.w, true, qaVar.x);
                            }
                        }
                    } else {
                        i17++;
                    }
                }
                if (i13 < 0 || i12 == i13) {
                    return;
                }
                int i18 = i13 - 1;
                ap apVar = this.f3;
                ArrayList arrayList2 = apVar.c.i3.N;
                if (i11 >= arrayList2.size() || i18 >= arrayList2.size()) {
                    return;
                }
                arrayList2.add(i18, (TLRPC.TL_username) arrayList2.remove(i11));
                apVar.p(i12, i13);
                while (i10 < arrayList2.size()) {
                    i10++;
                    apVar.m(i10);
                }
                return;
            }
        }
    }

    @Override // org.telegram.ui.Components.nm0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int R;
        int size = this.i3.N.size();
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i11 = TLObject.FLAG_31;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && (R = RecyclerView.R(childAt)) >= 1 && R <= size) {
                i10 = Math.min(childAt.getTop(), i10);
                i11 = Math.max(childAt.getBottom(), i11);
            }
        }
        if (i10 < i11) {
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.d6, this.n2);
            Paint paint = this.h3;
            paint.setColor(w02);
            canvas2 = canvas;
            canvas2.drawRect(0.0f, i10, getWidth(), i11, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(9999999, TLObject.FLAG_31));
    }
}
