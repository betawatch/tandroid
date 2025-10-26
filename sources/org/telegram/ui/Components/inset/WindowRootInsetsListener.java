package org.telegram.ui.Components.inset;

import android.view.View;
import android.view.Window;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;

/* loaded from: classes5.dex */
public class WindowRootInsetsListener extends WindowInsetsAnimationCompat.Callback implements OnApplyWindowInsetsListener {
    private WindowInsetsCompat windowInsetsAnimated;
    private WindowInsetsCompat windowInsetsTarget;

    public WindowRootInsetsListener() {
        super(1);
    }

    public void attach(Window window) {
        View decorView = window.getDecorView();
        ViewCompat.setOnApplyWindowInsetsListener(decorView, this);
        ViewCompat.setWindowInsetsAnimationCallback(decorView, this);
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        this.windowInsetsTarget = windowInsetsCompat;
        return windowInsetsCompat;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public WindowInsetsCompat onProgress(WindowInsetsCompat windowInsetsCompat, List list) {
        this.windowInsetsAnimated = windowInsetsCompat;
        return windowInsetsCompat;
    }
}
