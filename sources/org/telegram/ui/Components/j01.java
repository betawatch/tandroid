package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class j01 extends wk0 {
    public final /* synthetic */ ThemeEditorView.EditorAlert T2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j01(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.T2 = editorAlert;
    }

    @Override // org.telegram.ui.Components.wk0
    public final boolean E0(float f10) {
        return f10 >= ((float) ((AndroidUtilities.dp(48.0f) + this.T2.A) + AndroidUtilities.statusBarHeight));
    }
}
