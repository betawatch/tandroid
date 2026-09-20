package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class qo0 extends c8 {
    public final /* synthetic */ Context E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qo0(Object obj, Context context, Context context2, int i10) {
        super(context);
        this.y = i10;
        this.F = obj;
        this.E = context2;
    }

    @Override // org.telegram.ui.Components.c8
    public final TextView a() {
        switch (this.y) {
            case 0:
                z90 z90Var = new z90(this.E);
                z90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Si, ((so0) this.F).M));
                z90Var.setTextSize(1, 12.0f);
                z90Var.setEllipsize(TextUtils.TruncateAt.END);
                z90Var.setSingleLine(true);
                z90Var.setPadding(AndroidUtilities.dp(0.0f), 0, AndroidUtilities.dp(0.0f), AndroidUtilities.dp(0.0f));
                return z90Var;
            default:
                TextView textView = new TextView(this.E);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Pi, ((ProfileActivity) this.F).z0));
                textView.setTextSize(0, AndroidUtilities.dp(13.5f));
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity(3);
                return textView;
        }
    }
}
