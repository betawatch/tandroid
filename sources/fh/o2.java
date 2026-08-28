package fh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.l80;
import org.telegram.ui.ta1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class o2 extends FrameLayout {
    public final ta1 a;
    public int b;
    public final org.telegram.ui.Components.y5 c;
    public final ArrayList d;
    public final RectF e;
    public final RectF f;
    public final RectF h;
    public final Paint n;
    public int r;

    public o2(Context context, boolean z10) {
        super(context);
        this.d = new ArrayList();
        this.e = new RectF();
        this.f = new RectF();
        this.h = new RectF();
        this.n = new Paint(1);
        this.r = TLObject.FLAG_31;
        ta1 ta1Var = new ta1(this, context, 1);
        this.a = ta1Var;
        ta1Var.setClipToPadding(false);
        ta1Var.setClipChildren(false);
        ta1Var.setOrientation(0);
        ta1Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f));
        if (z10) {
            addView(ta1Var, g7.e6.e(-2, -1, 1));
        } else {
            ta1Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f));
            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
            horizontalScrollView.setHorizontalScrollBarEnabled(false);
            horizontalScrollView.setClipToPadding(false);
            horizontalScrollView.setClipChildren(false);
            horizontalScrollView.addView(ta1Var, g7.e6.e(-2, -1, 119));
            addView(horizontalScrollView, g7.e6.e(-1, -1, 119));
        }
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.c = new org.telegram.ui.Components.y5(ta1Var, 0L, 320L, gr.h);
    }

    public final void a(int i9, ArrayList arrayList, int i10, Utilities.Callback callback) {
        boolean z10 = this.r == i9;
        this.r = i9;
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        int size2 = arrayList.size();
        ta1 ta1Var = this.a;
        if (size != size2) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i11 >= arrayList2.size()) {
                    break;
                }
                CharSequence charSequence = i12 < arrayList.size() ? (CharSequence) arrayList.get(i12) : null;
                if (charSequence == null) {
                    ta1Var.removeView((View) arrayList2.remove(i11));
                    i11--;
                } else {
                    ((TextView) arrayList2.get(i11)).setText(charSequence);
                }
                i12++;
                i11++;
            }
            while (i12 < arrayList.size()) {
                l80 l80Var = new l80(getContext(), null);
                l80Var.setGravity(17);
                l80Var.setText((CharSequence) arrayList.get(i12));
                l80Var.setTypeface(AndroidUtilities.bold());
                l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.b6, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.c6, false)));
                l80Var.setTextSize(1, 14.0f);
                l80Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                l80Var.setEllipsize(TextUtils.TruncateAt.END);
                l80Var.setSingleLine();
                l80Var.setMaxLines(1);
                g7.g6.b(l80Var, 0.075f, 1.4f);
                ta1Var.addView(l80Var, g7.e6.n(-2, 26));
                arrayList2.add(l80Var);
                i12++;
            }
        }
        this.b = i10;
        if (!z10) {
            this.c.d(i10, true);
        }
        ta1Var.invalidate();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            ((TextView) arrayList2.get(i13)).setOnClickListener(new m2(i13, 0, callback));
        }
    }

    public final void b() {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i9 >= arrayList.size()) {
                this.a.invalidate();
                return;
            } else {
                ((TextView) arrayList.get(i9)).setTextColor(org.telegram.ui.ActionBar.f6.v(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.b6, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.c6, false)));
                i9++;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), i10);
    }
}
