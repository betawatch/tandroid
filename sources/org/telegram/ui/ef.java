package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ef implements ToIntFunction {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ef(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        int i10 = this.a;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                return ((Integer) ((HashMap) obj2).get((View) obj)).intValue();
            default:
                RectF rectF = ProfileActivity.R6;
                return ((Integer) ((ArrayList) obj2).get(((Integer) obj).intValue())).intValue();
        }
    }
}
