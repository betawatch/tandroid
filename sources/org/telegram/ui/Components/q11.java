package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class q11 extends vl0 {
    public final /* synthetic */ ThemeEditorView.EditorAlert X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q11(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.X2 = editorAlert;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean E0(float f7) {
        return f7 >= ((float) ((AndroidUtilities.dp(48.0f) + this.X2.E) + AndroidUtilities.statusBarHeight));
    }
}
