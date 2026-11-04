package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.File;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class Mp4Movie {
    private File cacheFile;
    private int height;
    private mc.d matrix = mc.d.j;
    private ArrayList<Track> tracks = new ArrayList<>();
    private int width;

    public void addSample(int i3, long j10, MediaCodec.BufferInfo bufferInfo) {
        if (i3 < 0 || i3 >= this.tracks.size()) {
            return;
        }
        this.tracks.get(i3).addSample(j10, bufferInfo);
    }

    public int addTrack(MediaFormat mediaFormat, boolean z10) {
        this.tracks.add(new Track(this.tracks.size(), mediaFormat, z10));
        return this.tracks.size() - 1;
    }

    public File getCacheFile() {
        return this.cacheFile;
    }

    public int getHeight() {
        return this.height;
    }

    public long getLastFrameTimestamp(int i3) {
        if (i3 < 0 || i3 >= this.tracks.size()) {
            return 0L;
        }
        return this.tracks.get(i3).getLastFrameTimestamp();
    }

    public mc.d getMatrix() {
        return this.matrix;
    }

    public ArrayList<Track> getTracks() {
        return this.tracks;
    }

    public int getWidth() {
        return this.width;
    }

    public void setCacheFile(File file) {
        this.cacheFile = file;
    }

    public void setRotation(int i3) {
        if (i3 == 0) {
            this.matrix = mc.d.j;
            return;
        }
        if (i3 == 90) {
            this.matrix = mc.d.k;
        } else if (i3 == 180) {
            this.matrix = mc.d.l;
        } else if (i3 == 270) {
            this.matrix = mc.d.m;
        }
    }

    public void setSize(int i3, int i10) {
        this.width = i3;
        this.height = i10;
    }
}
