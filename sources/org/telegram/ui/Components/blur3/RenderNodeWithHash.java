package org.telegram.ui.Components.blur3;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import org.telegram.messenger.MediaDataController;

/* loaded from: classes5.dex */
public class RenderNodeWithHash {
    private final HashBuilder hashBuilder = new HashBuilder();
    private long lastHash = 0;
    private int lastHeight;
    private int lastWidth;
    public final RenderNode renderNode;
    private final Renderer renderer;

    public interface Renderer {
        void renderNodeCalculateHash(HashBuilder hashBuilder);

        void renderNodeUpdateDisplayList(Canvas canvas);
    }

    public RenderNodeWithHash(RenderNode renderNode, Renderer renderer) {
        this.renderNode = renderNode;
        this.renderer = renderer;
    }

    public void updateDisplayListIfNeeded() {
        int width;
        int height;
        boolean hasDisplayList;
        RecordingCanvas beginRecording;
        width = this.renderNode.getWidth();
        height = this.renderNode.getHeight();
        this.hashBuilder.reset();
        this.renderer.renderNodeCalculateHash(this.hashBuilder);
        long j = this.hashBuilder.get();
        hasDisplayList = this.renderNode.hasDisplayList();
        boolean z = (hasDisplayList && width == this.lastWidth && height == this.lastHeight && j == this.lastHash && j != -1) ? false : true;
        this.lastWidth = width;
        this.lastHeight = height;
        this.lastHash = j;
        if (z) {
            beginRecording = this.renderNode.beginRecording();
            this.renderer.renderNodeUpdateDisplayList(beginRecording);
            this.renderNode.endRecording();
        }
    }

    public static class HashBuilder {
        private long hash;

        /* JADX INFO: Access modifiers changed from: private */
        public void reset() {
            this.hash = 0L;
        }

        public long get() {
            return this.hash;
        }

        public void add(long j) {
            this.hash = MediaDataController.calcHash(this.hash, j);
        }

        public void addF(float f) {
            this.hash = MediaDataController.calcHash(this.hash, Float.floatToIntBits(f));
        }

        public void add(boolean z) {
            this.hash = MediaDataController.calcHash(this.hash, z ? 1L : 0L);
        }

        public void unsupported() {
            this.hash = -1L;
        }
    }
}
