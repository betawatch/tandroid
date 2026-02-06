package org.telegram.ui.Components.blur3;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import org.telegram.ui.Components.blur3.capture.IBlur3Hash;

/* loaded from: classes5.dex */
public class RenderNodeWithHash {
    private final Blur3HashImpl hashBuilder = new Blur3HashImpl();
    private long lastHash = 0;
    private int lastHeight;
    private int lastWidth;
    public final RenderNode renderNode;
    private final Renderer renderer;

    public interface Renderer {
        void renderNodeCalculateHash(IBlur3Hash iBlur3Hash);

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
        this.hashBuilder.start();
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
}
