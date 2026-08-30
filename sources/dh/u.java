package dh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.g61;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class u extends FrameLayout {
    public final f9 a;
    public final TextView b;
    public n c;

    public u(Context context, int i10, f6 f6Var) {
        super(context);
        this.a = new f9(i10, this, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dpf2(1.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextColor(j6.v0(j6.E8, f6Var));
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(19);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 16.0f);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(68.0f), 0);
        addView(textView, b6.g());
    }

    public final g61 a(p2 p2Var, long j10, int i10, byte[] bArr, int i11, Utilities.Callback callback) {
        n nVar = this.c;
        if (nVar != null) {
            return nVar;
        }
        t tVar = new t(p2Var.getCurrentAccount(), p2Var.getMessagesController().getInputPeer(j10), i10, bArr, new ag.d(this, 27), callback);
        AndroidUtilities.runOnUIThread(new ag.d(tVar, 28), 1000L);
        n nVar2 = new n(p2Var, new m(tVar, 0), i11);
        this.c = nVar2;
        nVar2.V2.r = false;
        nVar2.j(new o(this, tVar));
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int width = getWidth() - AndroidUtilities.dp(11.0f);
        f9 f9Var = this.a;
        f9Var.setBounds(width - ((int) f9Var.c.d.f.a), AndroidUtilities.dp(12.0f), getWidth() - AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(12.0f));
        f9Var.c(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.b();
    }

    public void setText(String str) {
        this.b.setText(str);
    }
}
