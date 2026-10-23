package org.telegram.ui;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class hn extends TextView implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Cells.y a;
    public int b;
    public boolean c;
    public final /* synthetic */ sn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn(sn snVar, Activity activity) {
        super(activity);
        this.d = snVar;
        setSingleLine(true);
        setLines(1);
        setMaxLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.r6.W(this, org.telegram.ui.ActionBar.k6.Sh, snVar.getResourceProvider());
        int themedColor = snVar.getThemedColor(org.telegram.ui.ActionBar.k6.Oh);
        this.b = themedColor;
        org.telegram.ui.Cells.y e = org.telegram.ui.ActionBar.a6.e(new float[]{16.0f}, themedColor);
        this.a = e;
        setBackground(e);
        setTextSize(1, 14.0f);
        setTypeface(AndroidUtilities.bold());
        setGravity(17);
        setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), (int) (AndroidUtilities.displaySize.x * 0.45f)), TLObject.FLAG_31), i11);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            int themedColor = this.d.getThemedColor(org.telegram.ui.ActionBar.k6.Oh);
            if (themedColor == this.b && this.c == org.telegram.ui.ActionBar.k6.I.q()) {
                return;
            }
            Drawable background = getBackground();
            org.telegram.ui.Cells.y yVar = this.a;
            if (background == yVar) {
                this.c = org.telegram.ui.ActionBar.k6.I.q();
                org.telegram.ui.ActionBar.k6.E1(yVar, themedColor, false);
                org.telegram.ui.ActionBar.k6.E1(yVar, org.telegram.ui.ActionBar.a6.b(themedColor), true);
                this.b = themedColor;
                invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
