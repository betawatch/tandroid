package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;

/* loaded from: classes5.dex */
public final class EdgeEffectTrackerFactory extends RecyclerView.EdgeEffectFactory {
    private final TrackingEdgeEffect[] edgeEffects = new TrackingEdgeEffect[4];
    private final ArrayList listeners = new ArrayList();

    public interface OnEdgeEffectListener {
        void onEdgeEffectVisibilityChange(int i, boolean z);
    }

    public void addEdgeEffectListener(OnEdgeEffectListener onEdgeEffectListener) {
        this.listeners.add(onEdgeEffectListener);
    }

    public boolean hasVisibleEdges() {
        for (TrackingEdgeEffect trackingEdgeEffect : this.edgeEffects) {
            if (trackingEdgeEffect != null && trackingEdgeEffect.isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.EdgeEffectFactory
    protected EdgeEffect createEdgeEffect(RecyclerView recyclerView, int i) {
        TrackingEdgeEffect trackingEdgeEffect = new TrackingEdgeEffect(recyclerView.getContext(), i, new OnEdgeEffectListener() { // from class: org.telegram.ui.Components.EdgeEffectTrackerFactory$$ExternalSyntheticLambda0
            @Override // org.telegram.ui.Components.EdgeEffectTrackerFactory.OnEdgeEffectListener
            public final void onEdgeEffectVisibilityChange(int i2, boolean z) {
                EdgeEffectTrackerFactory.this.onEdgeEffectVisibilityChange(i2, z);
            }
        });
        this.edgeEffects[i] = trackingEdgeEffect;
        return trackingEdgeEffect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onEdgeEffectVisibilityChange(int i, boolean z) {
        Iterator it = this.listeners.iterator();
        while (it.hasNext()) {
            ((OnEdgeEffectListener) it.next()).onEdgeEffectVisibilityChange(i, z);
        }
    }

    private static final class TrackingEdgeEffect extends EdgeEffect {
        private final int direction;
        private boolean lastVisibility;
        private final OnEdgeEffectListener listener;

        TrackingEdgeEffect(Context context, int i, OnEdgeEffectListener onEdgeEffectListener) {
            super(context);
            this.direction = i;
            this.listener = onEdgeEffectListener;
        }

        public boolean isVisible() {
            float distance;
            if (!isFinished()) {
                if (Build.VERSION.SDK_INT >= 31) {
                    distance = getDistance();
                    if (distance != 0.0f) {
                    }
                }
                return true;
            }
            return false;
        }

        private void checkEdgeVisibility() {
            float distance;
            boolean isVisible = isVisible();
            if (this.lastVisibility != isVisible) {
                this.lastVisibility = isVisible;
                OnEdgeEffectListener onEdgeEffectListener = this.listener;
                if (onEdgeEffectListener != null) {
                    onEdgeEffectListener.onEdgeEffectVisibilityChange(this.direction, isVisible);
                    if (Build.VERSION.SDK_INT >= 31) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("onEdgeEffectVisibilityChange ");
                        sb.append(this.direction);
                        sb.append(" ");
                        sb.append(isVisible);
                        sb.append(" ");
                        distance = getDistance();
                        sb.append(distance);
                        AndroidUtilities.printStackTrace(sb.toString());
                    }
                }
            }
        }

        @Override // android.widget.EdgeEffect
        public void setSize(int i, int i2) {
            super.setSize(i, i2);
            checkEdgeVisibility();
        }

        @Override // android.widget.EdgeEffect
        public void finish() {
            super.finish();
            checkEdgeVisibility();
        }

        @Override // android.widget.EdgeEffect
        public void onPull(float f) {
            super.onPull(f);
            checkEdgeVisibility();
        }

        @Override // android.widget.EdgeEffect
        public void onPull(float f, float f2) {
            super.onPull(f, f2);
            checkEdgeVisibility();
        }

        @Override // android.widget.EdgeEffect
        public float onPullDistance(float f, float f2) {
            float onPullDistance = super.onPullDistance(f, f2);
            checkEdgeVisibility();
            return onPullDistance;
        }

        @Override // android.widget.EdgeEffect
        public void onRelease() {
            super.onRelease();
            checkEdgeVisibility();
        }

        @Override // android.widget.EdgeEffect
        public void onAbsorb(int i) {
            super.onAbsorb(i);
            checkEdgeVisibility();
        }

        @Override // android.widget.EdgeEffect
        public boolean draw(Canvas canvas) {
            boolean draw = super.draw(canvas);
            checkEdgeVisibility();
            return draw;
        }
    }
}
