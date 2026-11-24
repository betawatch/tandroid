// default package

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class di1 extends vz9 {
    public final /* synthetic */ yh1 f2;
    public final /* synthetic */ mz9[] g2;
    public final /* synthetic */ vi1 h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di1(vi1 vi1Var, vi1 vi1Var2, Activity activity, Integer num, int i, ylb ylbVar, int i2, int i3, yh1 yh1Var, mz9[] mz9VarArr) {
        super(vi1Var2, activity, true, num, i, true, ylbVar, i2, i3);
        this.h2 = vi1Var;
        this.f2 = yh1Var;
        this.g2 = mz9VarArr;
    }

    @Override // vz9
    public final long getDialogId() {
        return this.h2.a;
    }

    @Override // vz9
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // vz9
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.f2.a(Long.valueOf(l == null ? 0L : l.longValue()), num, tL_starGiftUnique);
        mz9 mz9Var = this.g2[0];
        if (mz9Var != null) {
            this.h2.R = null;
            mz9Var.dismiss();
        }
    }
}
