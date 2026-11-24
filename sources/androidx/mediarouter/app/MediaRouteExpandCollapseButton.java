package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class MediaRouteExpandCollapseButton extends jq {
    public final AnimationDrawable d;
    public final AnimationDrawable e;
    public final String f;
    public final String h;
    public boolean n;
    public View.OnClickListener r;

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AnimationDrawable animationDrawable = (AnimationDrawable) context.getDrawable(R.drawable.mr_group_expand);
        this.d = animationDrawable;
        AnimationDrawable animationDrawable2 = (AnimationDrawable) context.getDrawable(R.drawable.mr_group_collapse);
        this.e = animationDrawable2;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(yqe.b(context), PorterDuff.Mode.SRC_IN);
        animationDrawable.setColorFilter(porterDuffColorFilter);
        animationDrawable2.setColorFilter(porterDuffColorFilter);
        String string = context.getString(R.string.mr_controller_expand_group);
        this.f = string;
        this.h = context.getString(R.string.mr_controller_collapse_group);
        setImageDrawable(animationDrawable.getFrame(0));
        setContentDescription(string);
        super.setOnClickListener(new g6(this, (byte) 13));
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.r = onClickListener;
    }

    public MediaRouteExpandCollapseButton(Context context) {
        this(context, null);
    }
}
