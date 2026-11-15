package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class go extends org.telegram.ui.Components.uj0 {
    public static final /* synthetic */ int j3 = 0;
    public final fo f3;
    public boolean g3;
    public final Paint h3;
    public final /* synthetic */ ho i3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public go(ho hoVar, Context context) {
        super(context, null);
        this.i3 = hoVar;
        this.g3 = false;
        this.h3 = new Paint(1);
        fo foVar = new fo(this);
        this.f3 = foVar;
        setAdapter(foVar);
        setLayoutManager(new v4.b0());
        setOnItemClickListener(new eo(this));
        new v4.y(new gi.c(this, 2)).h(this);
    }

    @Override // org.telegram.ui.Components.uj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int R;
        int size = this.i3.O.size();
        int i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i10 = TLObject.FLAG_31;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt != null && (R = RecyclerView.R(childAt)) >= 1 && R <= size) {
                i7 = Math.min(childAt.getTop(), i7);
                i10 = Math.max(childAt.getBottom(), i10);
            }
        }
        if (i7 < i10) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d6, this.o2);
            Paint paint = this.h3;
            paint.setColor(w02);
            canvas2 = canvas;
            canvas2.drawRect(0.0f, i7, getWidth(), i10, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(9999999, TLObject.FLAG_31));
    }

    public final void z1(TLRPC.TL_username tL_username, boolean z10, boolean z11) {
        TLRPC.TL_username tL_username2;
        int min;
        ho hoVar = this.i3;
        ArrayList arrayList = hoVar.O;
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10) == tL_username) {
                int i11 = i10 + 1;
                if (i10 < 0 || i10 >= arrayList.size() || (tL_username2 = (TLRPC.TL_username) arrayList.get(i10)) == null) {
                    return;
                }
                int i12 = -1;
                if (tL_username2.active != z10) {
                    tL_username2.active = z10;
                    if (z10) {
                        int i13 = 0;
                        while (true) {
                            if (i13 >= arrayList.size()) {
                                i13 = -1;
                                break;
                            } else if (!((TLRPC.TL_username) arrayList.get(i13)).active) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                        if (i13 >= 0) {
                            min = Math.max(0, i13 - 1);
                            i12 = min + 1;
                        }
                    } else {
                        int i14 = -1;
                        for (int i15 = 0; i15 < arrayList.size(); i15++) {
                            if (((TLRPC.TL_username) arrayList.get(i15)).active) {
                                i14 = i15;
                            }
                        }
                        if (i14 >= 0) {
                            min = Math.min(arrayList.size() - 1, i14 + 1);
                            i12 = min + 1;
                        }
                    }
                }
                int i16 = 0;
                while (true) {
                    if (i16 >= getChildCount()) {
                        break;
                    }
                    View childAt = getChildAt(i16);
                    if (RecyclerView.R(childAt) == i11) {
                        if (z11) {
                            org.telegram.messenger.g0.E3(childAt);
                        }
                        if (childAt instanceof ia) {
                            ia iaVar = (ia) childAt;
                            iaVar.setLoading(hoVar.Q.contains(tL_username2.username));
                            TLRPC.TL_username tL_username3 = iaVar.w;
                            if (tL_username3 != null) {
                                iaVar.a(tL_username3, iaVar.x, true, iaVar.y);
                            }
                        }
                    } else {
                        i16++;
                    }
                }
                if (i12 < 0 || i11 == i12) {
                    return;
                }
                int i17 = i12 - 1;
                fo foVar = this.f3;
                ArrayList arrayList2 = foVar.c.i3.O;
                if (i10 >= arrayList2.size() || i17 >= arrayList2.size()) {
                    return;
                }
                arrayList2.add(i17, (TLRPC.TL_username) arrayList2.remove(i10));
                foVar.j(i11, i12);
                while (i7 < arrayList2.size()) {
                    i7++;
                    foVar.g(i7);
                }
                return;
            }
        }
    }
}
