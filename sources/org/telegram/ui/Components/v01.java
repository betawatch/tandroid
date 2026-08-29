package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class v01 extends jl0 {
    public final /* synthetic */ ThemeEditorView.EditorAlert T2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v01(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.T2 = editorAlert;
    }

    @Override // org.telegram.ui.Components.jl0
    public final boolean E0(float f9) {
        return f9 >= ((float) ((AndroidUtilities.dp(48.0f) + this.T2.A) + AndroidUtilities.statusBarHeight));
    }
}
