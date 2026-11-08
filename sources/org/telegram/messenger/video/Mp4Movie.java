package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.File;
import java.util.ArrayList;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public class Mp4Movie {
    private File cacheFile;
    private int height;
    private pc.d matrix = pc.d.j;
    private ArrayList<Track> tracks = new ArrayList<>();
    private int width;

    public void addSample(int i7, long j3, MediaCodec.BufferInfo bufferInfo) {
        if (i7 < 0 || i7 >= this.tracks.size()) {
            return;
        }
        this.tracks.get(i7).addSample(j3, bufferInfo);
    }

    public int addTrack(MediaFormat mediaFormat, boolean z9) {
        this.tracks.add(new Track(this.tracks.size(), mediaFormat, z9));
        return this.tracks.size() - 1;
    }

    public File getCacheFile() {
        return this.cacheFile;
    }

    public int getHeight() {
        return this.height;
    }

    public long getLastFrameTimestamp(int i7) {
        if (i7 < 0 || i7 >= this.tracks.size()) {
            return 0L;
        }
        return this.tracks.get(i7).getLastFrameTimestamp();
    }

    public pc.d getMatrix() {
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

    public void setRotation(int i7) {
        if (i7 == 0) {
            this.matrix = pc.d.j;
            return;
        }
        if (i7 == 90) {
            this.matrix = pc.d.k;
        } else if (i7 == 180) {
            this.matrix = pc.d.l;
        } else if (i7 == 270) {
            this.matrix = pc.d.m;
        }
    }

    public void setSize(int i7, int i10) {
        this.width = i7;
        this.height = i10;
    }
}
