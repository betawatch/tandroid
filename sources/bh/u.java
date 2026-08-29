package bh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.u51;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class u extends FrameLayout {
    public final j9 a;
    public final TextView b;
    public n c;

    public u(Context context, int i10, c6 c6Var) {
        super(context);
        this.a = new j9(i10, this, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dpf2(1.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextColor(g6.v0(g6.E8, c6Var));
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(19);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 16.0f);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(68.0f), 0);
        addView(textView, f6.g());
    }

    public final u51 a(o2 o2Var, long j10, int i10, byte[] bArr, int i11, Utilities.Callback callback) {
        n nVar = this.c;
        if (nVar != null) {
            return nVar;
        }
        t tVar = new t(o2Var.getCurrentAccount(), o2Var.getMessagesController().getInputPeer(j10), i10, bArr, new a4.g(this, 19), callback);
        AndroidUtilities.runOnUIThread(new a4.g(tVar, 20), 1000L);
        n nVar2 = new n(o2Var, new m(tVar, 0), i11);
        this.c = nVar2;
        nVar2.U2.r = false;
        nVar2.j(new o(this, tVar));
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int width = getWidth() - AndroidUtilities.dp(11.0f);
        j9 j9Var = this.a;
        j9Var.setBounds(width - ((int) j9Var.c.d.f.a), AndroidUtilities.dp(12.0f), getWidth() - AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(12.0f));
        j9Var.c(canvas);
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
