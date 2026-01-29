package org.telegram.ui.ActionBar;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;

/* loaded from: classes4.dex */
public final /* synthetic */ class ActionBarLayout$$ExternalSyntheticLambda3 implements OnApplyWindowInsetsListener {
    public final /* synthetic */ BaseFragment f$0;

    public /* synthetic */ ActionBarLayout$$ExternalSyntheticLambda3(BaseFragment baseFragment) {
        this.f$0 = baseFragment;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        return this.f$0.onInsetsInternal(view, windowInsetsCompat);
    }
}
