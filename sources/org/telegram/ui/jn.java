package org.telegram.ui;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class jn extends TextView implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.Cells.y a;
    public int b;
    public boolean c;
    public final /* synthetic */ un d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn(un unVar, Activity activity) {
        super(activity);
        this.d = unVar;
        setSingleLine(true);
        setLines(1);
        setMaxLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.a7.V(this, org.telegram.ui.ActionBar.t6.Gi, unVar.getResourceProvider());
        int themedColor = unVar.getThemedColor(org.telegram.ui.ActionBar.t6.Ci);
        this.b = themedColor;
        org.telegram.ui.Cells.y e = org.telegram.ui.ActionBar.j6.e(themedColor, 16.0f);
        this.a = e;
        setBackground(e);
        setTextSize(1, 14.0f);
        setTypeface(org.telegram.messenger.i0.o());
        setGravity(17);
        setPadding(org.telegram.messenger.i0.L(14.0f), 0, org.telegram.messenger.i0.L(14.0f), 0);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), (int) (org.telegram.messenger.i0.q.x * 0.45f)), TLObject.FLAG_31), i11);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            int themedColor = this.d.getThemedColor(org.telegram.ui.ActionBar.t6.Ci);
            if (themedColor == this.b && this.c == org.telegram.ui.ActionBar.t6.I.q()) {
                return;
            }
            Drawable background = getBackground();
            org.telegram.ui.Cells.y yVar = this.a;
            if (background == yVar) {
                this.c = org.telegram.ui.ActionBar.t6.I.q();
                org.telegram.ui.ActionBar.t6.H1(yVar, themedColor, false);
                org.telegram.ui.ActionBar.t6.H1(yVar, org.telegram.ui.ActionBar.j6.b(themedColor), true);
                this.b = themedColor;
                invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
